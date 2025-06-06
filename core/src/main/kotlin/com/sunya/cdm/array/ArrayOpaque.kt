package com.sunya.cdm.array

import com.sunya.cdm.api.Datatype
import com.sunya.cdm.api.Section
import com.sunya.cdm.api.toIntArray
import com.sunya.cdm.api.toLongArray
import com.sunya.cdm.layout.IndexND
import com.sunya.cdm.layout.IndexSpace
import java.nio.ByteBuffer

class ArrayOpaque(shape : IntArray, val values : ByteBuffer, val size : Int) : ArrayTyped<ByteArray>(values, Datatype.OPAQUE, shape) {
    init {
        require(nelems * size <= values.capacity())
    }

    // src element is the 1D index
    fun getElement(srcElem : Int) : ByteArray {
        val elem = ByteArray(size)
        copyElem(srcElem, elem, 0)
        return elem
    }

    override fun iterator(): Iterator<ByteArray> = BufferIterator()
    private inner class BufferIterator : AbstractIterator<ByteArray>() {
        private var idx = 0
        override fun computeNext() = if (idx >= nelems) done() else {
            val elem = ByteArray(size)
            copyElem(idx, elem, 0)
            idx++
            setNext(elem)
        }
    }

    // copy the src[srcIdx] element the dstIdx element in dest[dstIdx]
    private fun copyElem(srcIdx : Int, dest : ByteArray, dstIdx : Int) {
        repeat(size) { dest.set(dstIdx * size + it, values.get(srcIdx * size + it)) }
    }

    override fun showValues(): String {
        return buildString {
            val iter = this@ArrayOpaque.iterator()
            for (ba in iter) {
                append("'${ba.contentToString()}',")
            }
        }
    }

    override fun section(section : Section) : ArrayOpaque {
        val sectionNelems = section.totalElements.toInt()
        val sectionBB = ByteArray(size * sectionNelems)

        val odo = IndexND(IndexSpace(section), this.shape.toLongArray())
        // was         var dstIdx = 0
        //        for (index in odo) {
        //            copyElem(odo.element().toInt(), sectionBB, dstIdx)
        //            dstIdx++
        //        }
        for ((dstIdx, index) in odo.withIndex())
            copyElem(odo.element().toInt(), sectionBB, dstIdx)
        return ArrayOpaque(section.shape.toIntArray(), ByteBuffer.wrap(sectionBB), size)
    }

}