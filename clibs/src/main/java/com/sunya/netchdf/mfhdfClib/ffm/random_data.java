// Generated by jextract

package com.sunya.netchdf.mfhdfClib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct random_data {
 *     int32_t* fptr;
 *     int32_t* rptr;
 *     int32_t* state;
 *     int rand_type;
 *     int rand_deg;
 *     int rand_sep;
 *     int32_t* end_ptr;
 * };
 * }
 */
public class random_data {

    public static MemoryLayout $LAYOUT() {
        return constants$52.const$1;
    }
    public static VarHandle fptr$VH() {
        return constants$52.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int32_t* fptr;
     * }
     */
    public static MemorySegment fptr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$52.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int32_t* fptr;
     * }
     */
    public static void fptr$set(MemorySegment seg, MemorySegment x) {
        constants$52.const$2.set(seg, x);
    }
    public static MemorySegment fptr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$52.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void fptr$set(MemorySegment seg, long index, MemorySegment x) {
        constants$52.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rptr$VH() {
        return constants$52.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int32_t* rptr;
     * }
     */
    public static MemorySegment rptr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$52.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int32_t* rptr;
     * }
     */
    public static void rptr$set(MemorySegment seg, MemorySegment x) {
        constants$52.const$3.set(seg, x);
    }
    public static MemorySegment rptr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$52.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void rptr$set(MemorySegment seg, long index, MemorySegment x) {
        constants$52.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle state$VH() {
        return constants$52.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int32_t* state;
     * }
     */
    public static MemorySegment state$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$52.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int32_t* state;
     * }
     */
    public static void state$set(MemorySegment seg, MemorySegment x) {
        constants$52.const$4.set(seg, x);
    }
    public static MemorySegment state$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$52.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, MemorySegment x) {
        constants$52.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rand_type$VH() {
        return constants$52.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int rand_type;
     * }
     */
    public static int rand_type$get(MemorySegment seg) {
        return (int)constants$52.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int rand_type;
     * }
     */
    public static void rand_type$set(MemorySegment seg, int x) {
        constants$52.const$5.set(seg, x);
    }
    public static int rand_type$get(MemorySegment seg, long index) {
        return (int)constants$52.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void rand_type$set(MemorySegment seg, long index, int x) {
        constants$52.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rand_deg$VH() {
        return constants$53.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int rand_deg;
     * }
     */
    public static int rand_deg$get(MemorySegment seg) {
        return (int)constants$53.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int rand_deg;
     * }
     */
    public static void rand_deg$set(MemorySegment seg, int x) {
        constants$53.const$0.set(seg, x);
    }
    public static int rand_deg$get(MemorySegment seg, long index) {
        return (int)constants$53.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void rand_deg$set(MemorySegment seg, long index, int x) {
        constants$53.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rand_sep$VH() {
        return constants$53.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int rand_sep;
     * }
     */
    public static int rand_sep$get(MemorySegment seg) {
        return (int)constants$53.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int rand_sep;
     * }
     */
    public static void rand_sep$set(MemorySegment seg, int x) {
        constants$53.const$1.set(seg, x);
    }
    public static int rand_sep$get(MemorySegment seg, long index) {
        return (int)constants$53.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void rand_sep$set(MemorySegment seg, long index, int x) {
        constants$53.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle end_ptr$VH() {
        return constants$53.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int32_t* end_ptr;
     * }
     */
    public static MemorySegment end_ptr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$53.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int32_t* end_ptr;
     * }
     */
    public static void end_ptr$set(MemorySegment seg, MemorySegment x) {
        constants$53.const$2.set(seg, x);
    }
    public static MemorySegment end_ptr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$53.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void end_ptr$set(MemorySegment seg, long index, MemorySegment x) {
        constants$53.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


