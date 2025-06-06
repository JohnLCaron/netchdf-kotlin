package com.sunya.cdm.layout

import com.sunya.cdm.api.Datatype
import com.sunya.cdm.api.Section
import java.nio.ByteBuffer

enum class Merge { all, none, notFirst }

/**
 * Copies the intersection of a dataChunk and wantSpace to the destination buffer.
 * Each dataChunk gets its own Chunker, which can only be used once.
 * The wantSpace is a (possibly improper) subset of the variable's IndexSpace.
 * Finds contiguous chunks of data to copy from the dataChunk to the destination.
 * The iteration is monotonic in both src and dest positions.

 * @param dataChunk the dataChunk, may have a trailing dimension that is ignored
 * @param wantSpace the requested section of data.
 * @param merge merge strategy for dimensions that can be merged and still keep contiguous transfer
 */
class Chunker(val dataChunk: IndexSpace, val wantSpace: IndexSpace, merge : Merge = Merge.all) : AbstractIterator<TransferChunk>() {

    val nelems: Int // number of elements to read at one time
    val totalNelems: Long // total number of elements in wantSection

    private val srcOdometer: IndexND
    private val dstOdometer: IndexND
    private val incrDigit: Int
    var transferChunks = 0

    init {
        val intersectSpace = wantSpace.intersect(dataChunk)

        // shift intersect to dataChunk and wantSection origins
        val dataChunkShifted = intersectSpace.shift(dataChunk.start) // dataChunk origin
        val wantSectionShifted = intersectSpace.shift(wantSpace.start) // wantSection origin

        // construct odometers over source and destination index spaces
        this.srcOdometer = IndexND(dataChunkShifted, dataChunk.shape)
        this.dstOdometer = IndexND(wantSectionShifted, wantSpace.shape)
        this.totalNelems = intersectSpace.totalElements

        val rank = intersectSpace.rank
        val mergeNDims = countMergeDims(intersectSpace, dataChunk.shape, wantSpace.shape, merge)
        // the first dimension to merge
        val firstDim = if (rank == mergeNDims) 0 else rank - mergeNDims - 1

        var product = 1L
        for (idx in rank - 1 downTo firstDim) {
            product *= intersectSpace.shape[idx]
        }
        this.nelems = if ((rank == 1) && (merge == Merge.notFirst)) 1 else product.toInt()

        // the digit to increment when iterating
        this.incrDigit = if (firstDim == 0) 0 else firstDim - 1
    }

    constructor(section : Section, merge : Merge = Merge.all) : this(IndexSpace(section.varShape), IndexSpace(section), merge)

    private fun countMergeDims(
        intersect: IndexSpace,
        dataChunkShape: LongArray,
        dataSubsetShape: LongArray,
        merge: Merge
    ): Int {
        if (merge == Merge.none) return 0
        val mergeDownto = if (merge == Merge.all) 0 else 2

        var mergeDims = 0 // how many dimensions can be merged?
        for (idx in intersect.rank - 1 downTo mergeDownto) {
            if ((intersect.shape[idx] == dataChunkShape[idx]) && (intersect.shape[idx] == dataSubsetShape[idx])) {
                mergeDims++
            } else {
                break
            }
        }
        return mergeDims
    }

    //// iterator
    private var done: Long = 0 // done so far
    private var first = true

    override fun computeNext() {
        if (done >= totalNelems) {
            return done()
        }
        if (!first) {
            srcOdometer.incr(incrDigit)
            dstOdometer.incr(incrDigit)
        }
        val srcElem = srcOdometer.element()
        val dstElem = dstOdometer.element()
        //println(" srcElem = ${srcOdometer.current.contentToString()} = ${srcElem}")
        //println(" dstElem = ${dstOdometer.current.contentToString()} = ${dstElem}")
        setNext(TransferChunk(srcElem, nelems, dstElem))

        done += nelems.toLong()
        first = false
        transferChunks++
    }

    override fun toString(): String {
        return "Chunker(nelems=$nelems, totalNelems=$totalNelems, dataChunk=$dataChunk, wantSpace=$wantSpace)"
    }

    // transfer from src to dst buffer, using my computed chunks
    internal fun transfer(src: ByteBuffer, elemSize : Int, dst: ByteBuffer) {
        for (chunk in this) {
            System.arraycopy(
                src.array(),
                src.arrayOffset() + elemSize * chunk.srcElem.toInt(),
                dst.array(),
                dst.arrayOffset() + elemSize * chunk.destElem.toInt(),
                elemSize * chunk.nelems,
            )
        }
    }

    internal fun transferBB(src: ByteBuffer, elemSize : Int, totalElems: Int) : ByteBuffer {
        val dst = ByteBuffer.allocate(elemSize * totalElems)
        var dstElem = 0 // ignore chunker dstPosition
        for (chunk in this) {
            // Object src,  int  srcPos, Object dest, int destPos, int length
            System.arraycopy(
                src.array(),
                src.arrayOffset() + elemSize * chunk.srcElem.toInt(),
                dst.array(),
                dst.arrayOffset() + elemSize * dstElem,
                elemSize * chunk.nelems,
            )
            dstElem += chunk.nelems
        }
        return dst
    }

    // transfer fillValue to dst buffer, using my computed chunks
    internal fun transferMissing(fillValue: Any?, datatype: Datatype<*>, elemSize: Int, dst: ByteBuffer) {
        if (fillValue == null) {
            return
        }
        for (chunk in this) {
            if (debugChunking) println("  missing chunk $chunk fillValue=$fillValue")
            dst.position(elemSize * chunk.destElem.toInt())
            transferMissingNelems(fillValue, datatype, chunk.nelems, dst)
        }
    }
}

private const val debugChunking = false

internal fun transferMissingNelems(fillValue: Any?, datatype: Datatype<*>, nelems : Int, dst: ByteBuffer) {
    if (fillValue == null) {
        return
    }
    when (datatype) {
        Datatype.STRING, Datatype.CHAR, Datatype.BYTE -> {
            val fill = fillValue as Byte
            repeat(nelems) { dst.put(fill) }
        }

        Datatype.UBYTE, Datatype.ENUM1 -> {
            val fill = fillValue as UByte
            repeat(nelems) { dst.put(fill.toByte()) }
        }

        Datatype.SHORT -> repeat(nelems) { dst.putShort(fillValue as Short) }
        Datatype.USHORT, Datatype.ENUM2 -> repeat(nelems) { dst.putShort((fillValue as UShort).toShort()) }
        Datatype.INT -> repeat(nelems) { dst.putInt(fillValue as Int) }
        Datatype.UINT, Datatype.ENUM4 -> repeat(nelems) { dst.putInt((fillValue as UInt).toInt()) }
        Datatype.FLOAT -> repeat(nelems) { dst.putFloat(fillValue as Float) }
        Datatype.DOUBLE -> repeat(nelems) { dst.putDouble(fillValue as Double) }
        Datatype.LONG -> repeat(nelems) { dst.putLong(fillValue as Long) }
        Datatype.ULONG -> repeat(nelems) { dst.putLong((fillValue as ULong).toLong()) }
        Datatype.OPAQUE -> {
            val fill = fillValue as ByteBuffer
            repeat(nelems) {
                fill.position(it)
                dst.put(fill)
            }
        }

        else -> throw IllegalStateException("unimplemented type= $datatype")
    }
}