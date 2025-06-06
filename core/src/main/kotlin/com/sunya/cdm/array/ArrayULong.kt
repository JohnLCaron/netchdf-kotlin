package com.sunya.cdm.array

import com.sunya.cdm.api.Datatype
import com.sunya.cdm.api.Section
import com.sunya.cdm.api.toIntArray
import java.nio.ByteBuffer
import java.nio.LongBuffer

class ArrayULong(shape : IntArray, bb : ByteBuffer) : ArrayTyped<ULong>(bb, Datatype.ULONG, shape) {
    val values: LongBuffer = bb.asLongBuffer()

    override fun iterator(): Iterator<ULong> = BufferIterator()
    private inner class BufferIterator : AbstractIterator<ULong>() {
        private var idx = 0
        override fun computeNext() {
            if (idx >= values.limit()) done() else setNext(values.get(idx++).toULong())
        }
    }

    override fun section(section : Section) : ArrayULong {
        return ArrayULong(section.shape.toIntArray(), sectionFrom(section))
    }
}