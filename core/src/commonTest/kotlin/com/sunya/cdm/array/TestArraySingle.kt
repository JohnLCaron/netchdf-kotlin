package com.sunya.cdm.array

import com.sunya.cdm.api.*
import kotlin.test.*
import kotlin.test.*

class TestArraySingle {

    @Test
    fun testArraySingle() {
        val shape = intArrayOf(1,2,3)
        val size = shape.computeSize()
        // class ArraySingle<T>(shape : IntArray, datatype : Datatype<*>, fillValueAny : Any) :
        val single = ArraySingle<Long>(shape, Datatype.LONG, 123L)
        assertEquals(Datatype.LONG, single.datatype)
        assertEquals(size, single.nelems)
        assertEquals("ArraySingle datatype=int64 shape=[1, 2, 3] data= 123 (class kotlin.Long) \n", single.toString())

        var count = 0
        single.forEach {
            assertEquals(123L, it)
            count++
        }
        assertEquals(size, count)

        val section = longArrayOf(41)
        val sectionArray = single.section(Section(section))
        assertEquals(Datatype.LONG, sectionArray.datatype)
        assertEquals(section.computeSize(), sectionArray.nelems.toLong())

        count = 0
        sectionArray.forEach {
            assertEquals(123L, it)
            count++
        }
        assertEquals(sectionArray.nelems, count)
    }

    @Test
    fun testArrayEmpty() {
        val shape = intArrayOf(1,2,3)
        val size = shape.computeSize()
        val empty = ArrayEmpty<UShort>(shape, Datatype.USHORT)
        assertEquals(Datatype.USHORT, empty.datatype)
        assertEquals(size, empty.nelems)

        var count = 0
        empty.forEach {
            assertEquals(42.toUShort(), it) // doesnt happen
            count++
        }
        assertEquals(0, count)

        val section = longArrayOf(41)
        val sectionArray = empty.section(Section(section))
        assertEquals(Datatype.USHORT, sectionArray.datatype)
        assertEquals(section.computeSize(), sectionArray.nelems.toLong())

        count = 0
        sectionArray.forEach {
            assertEquals(42.toUShort(), it) // doesnt happen
            count++
        }
        assertEquals(0, count)
    }
}