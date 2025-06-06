package com.sunya.netchdf.hdf5

import com.sunya.cdm.api.*
import com.sunya.cdm.array.*
import com.sunya.cdm.iosp.*
import com.sunya.cdm.layout.Layout
import com.sunya.cdm.layout.LayoutRegular
import java.io.IOException
import java.nio.ByteBuffer
import java.nio.ByteOrder

private const val debugLayout = false

// Handles reading attributes and non-chunked Variables
internal fun <T> H5builder.readRegularData(dc: DataContainer, datatype: Datatype<T>, section : Section?): ArrayTyped<T> {
    if (dc.mds.type == DataspaceType.Null) {
        return ArrayString(intArrayOf(), listOf()) as ArrayTyped<T>
    }
    val h5type = dc.h5type
    val elemSize = h5type.elemSize

    val wantSection = section ?: Section(dc.storageDims)
    val layout: Layout = LayoutRegular(dc.dataPos, elemSize, wantSection)

    if (h5type.datatype5 == Datatype5.Vlen) {
        return readVlenDataWithLayout(dc, layout, wantSection)
    }

    val state = OpenFileState(0, h5type.endian)
    return readDataWithLayout(state, layout, datatype, wantSection.shape, h5type)
}

// LOOK: not subsetting
@Throws(IOException::class)
internal fun <T> H5builder.readCompactData(v2 : Variable<T>, shape : IntArray): ArrayTyped<T> {
    val vinfo = v2.spObject as DataContainerVariable
    val bb = when (vinfo.mdl) {
        is DataLayoutCompact -> vinfo.mdl.compactData
        is DataLayoutCompact3 -> vinfo.mdl.compactData
        else -> throw RuntimeException("CompactData must be DataLayoutCompact or DataLayoutCompact3")
    }
    bb.position(0)
    bb.limit(bb.capacity())
    bb.order(vinfo.h5type.endian)

    return this.processDataIntoArray(bb, vinfo.h5type.datatype(), shape, vinfo.h5type, vinfo.elementSize) as ArrayTyped<T>
}

// handles reading data with a Layout. LOOK: Fill Value ??
@Throws(IOException::class)
internal fun <T> H5builder.readDataWithLayout(state: OpenFileState, layout: Layout, datatype: Datatype<T>, shape : LongArray, h5type : H5TypeInfo): ArrayTyped<T> {
    val sizeBytes = layout.totalNelems * layout.elemSize
    if (sizeBytes <= 0 || sizeBytes >= Integer.MAX_VALUE) {
        throw java.lang.RuntimeException("Illegal nbytes to read = $sizeBytes")
    }
    val bb = ByteBuffer.allocate(sizeBytes.toInt())
    bb.order(h5type.base?.endian ?: h5type.endian)

    var count = 0
    while (layout.hasNext()) {
        val chunk = layout.next()
        state.pos = chunk.srcPos()
        raf.readIntoByteBufferDirect(
            state,
            bb,
            layout.elemSize * chunk.destElem().toInt(),
            layout.elemSize * chunk.nelems()
        )
        count++
        if (debugLayout and (count < 20)) println("oldchunk = $chunk")
    }
    bb.position(0)
    bb.limit(bb.capacity())
    bb.order(h5type.base?.endian ?: h5type.endian)

    return this.processDataIntoArray(bb, datatype, shape.toIntArray(), h5type, layout.elemSize)
}

internal fun <T> H5builder.processDataIntoArray(bb: ByteBuffer, datatype: Datatype<T>, shape : IntArray, h5type : H5TypeInfo, elemSize : Int): ArrayTyped<T> {

    if (h5type.datatype5 == Datatype5.Compound) {
        val members = (datatype.typedef as CompoundTypedef).members
        val sdataArray =  ArrayStructureData(shape, bb, elemSize, members)
        return processCompoundData(sdataArray, bb.order()) as ArrayTyped<T>
    }

    // convert to array of Strings by reducing rank by 1, tricky shape shifting for non-scalars
    if (datatype == Datatype.STRING) {
        val extshape = IntArray(shape.size + 1) { if (it == shape.size) elemSize else shape[it] }
        val result = ArrayUByte(extshape, bb)
        return result.makeStringsFromBytes() as ArrayTyped<T>
    }

    var result = when (datatype) {
        Datatype.BYTE -> ArrayByte(shape, bb)
        Datatype.STRING, Datatype.CHAR, Datatype.UBYTE, Datatype.ENUM1 -> ArrayUByte(shape, datatype as Datatype<UByte>, bb)
        Datatype.SHORT -> ArrayShort(shape, bb)
        Datatype.USHORT, Datatype.ENUM2 -> ArrayUShort(shape, datatype as Datatype<UShort>, bb)
        Datatype.INT -> ArrayInt(shape, bb)
        Datatype.UINT, Datatype.ENUM4 -> ArrayUInt(shape, datatype as Datatype<UInt>, bb)
        Datatype.FLOAT -> ArrayFloat(shape, bb)
        Datatype.DOUBLE -> ArrayDouble(shape, bb)
        Datatype.REFERENCE, Datatype.LONG -> ArrayLong(shape, bb)
        Datatype.ULONG -> ArrayULong(shape, bb)
        Datatype.OPAQUE -> ArrayOpaque(shape, bb, h5type.elemSize)
        else -> throw IllegalStateException("unimplemented type= $datatype")
    }

    // TODO
    // if ((h5type.datatype5 == Datatype5.Reference) and h5type.isRefObject) {
    // result = ArrayString(shape, this.convertReferencesToDataObjectName(result as ArrayLong))
    // }

    return result as ArrayTyped<T>
}

// Put the variable length members (vlen, string) on the heap
internal fun H5builder.processCompoundData(sdataArray : ArrayStructureData, endian : ByteOrder) : ArrayStructureData {
    val h5heap = H5heap(this)
    sdataArray.putStringsOnHeap {  member, offset ->
        val result = mutableListOf<String>()
        repeat(member.nelems) {
            val sval = h5heap.readHeapString(sdataArray.bb, offset + it * 16) // 16 byte "heap ids" are in the ByteBuffer
            result.add(sval!!) // 16 byte "heap ids" are in the ByteBuffer
        }
        result
    }

    sdataArray.putVlensOnHeap { member, offset ->
        val listOfArrays = mutableListOf<Array<*>>()
        for (i in 0 until member.nelems) {
            val heapId = h5heap.readHeapIdentifier(sdataArray.bb, offset)
            val vlenArray = h5heap.getHeapDataArray(heapId, member.datatype, endian)
            listOfArrays.add(vlenArray)
        }
        val basetype = member.datatype.typedef!!.baseType
        ArrayVlen.fromArray(member.dims, listOfArrays, basetype)
    }

    return sdataArray
}

// this apparently has heapId addresses
internal fun <T> H5builder.readVlenDataWithLayout(dc: DataContainer, layout : Layout, wantSection : Section) : ArrayTyped<T> {
    val h5heap = H5heap(this)
    val shape = wantSection.shape.toIntArray()

    if (dc.h5type.isVlenString) {
        val sarray = mutableListOf<String>()
        while (layout.hasNext()) {
            val chunk: Layout.Chunk = layout.next()
            for (i in 0 until chunk.nelems()) {
                val address: Long = chunk.srcPos() + layout.elemSize * i
                val sval = h5heap.readHeapString(address)
                sarray.add(sval ?: "")
            }
        }
        return ArrayString(shape, sarray) as ArrayTyped<T>

    } else {
        val base = dc.h5type.base!!
        if (base.datatype5 == Datatype5.Reference) {
            val refsList = mutableListOf<String>()
            while (layout.hasNext()) {
                val chunk: Layout.Chunk = layout.next()
                for (i in 0 until chunk.nelems()) {
                    val address: Long = chunk.srcPos() + layout.elemSize * i  // address of the heapId vs the heap id ??
                    val vlenArray = h5heap.getHeapDataArray(address, Datatype.LONG, base.endian) as Array<Long>
                    // so references are addresses; then use address to point to String
                    // TODO val refsArray = this.convertReferencesToDataObjectName(vlenArray.asIterable())
                    val refsArray = this.convertReferencesToDataObjectName(vlenArray)
                    for (s in refsArray) {
                        refsList.add(s)
                    }
                }
            }
            return ArrayString(shape, refsList) as ArrayTyped<T>
        }

        // general case is to read an array of vlen objects
        // each vlen generates an Array of type baseType
        val listOfArrays = mutableListOf<Array<*>>()
        val readDatatype = base.datatype()
        var count = 0
        while (layout.hasNext()) {
            val chunk: Layout.Chunk = layout.next()
            for (i in 0 until chunk.nelems()) {
                val address: Long = chunk.srcPos() + layout.elemSize * i
                val vlenArray = h5heap.getHeapDataArray(address, readDatatype, base.endian)
                // LOOK require vlenArray is Array<T>
                listOfArrays.add(vlenArray)
                count++
            }
        }
        return ArrayVlen.fromArray(shape, listOfArrays, readDatatype) as ArrayTyped<T>
    }
}

