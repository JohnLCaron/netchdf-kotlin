// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct H5Z_class1_t {
 *     H5Z_filter_t id;
 *     char* name;
 *     H5Z_can_apply_func_t can_apply;
 *     H5Z_set_local_func_t set_local;
 *     H5Z_func_t filter;
 * };
 * }
 */
public class H5Z_class1_t {

    public static MemoryLayout $LAYOUT() {
        return constants$398.const$0;
    }
    public static VarHandle id$VH() {
        return constants$398.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * H5Z_filter_t id;
     * }
     */
    public static int id$get(MemorySegment seg) {
        return (int)constants$398.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * H5Z_filter_t id;
     * }
     */
    public static void id$set(MemorySegment seg, int x) {
        constants$398.const$1.set(seg, x);
    }
    public static int id$get(MemorySegment seg, long index) {
        return (int)constants$398.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void id$set(MemorySegment seg, long index, int x) {
        constants$398.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle name$VH() {
        return constants$398.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static MemorySegment name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$398.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static void name$set(MemorySegment seg, MemorySegment x) {
        constants$398.const$2.set(seg, x);
    }
    public static MemorySegment name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$398.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$398.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle can_apply$VH() {
        return constants$398.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * H5Z_can_apply_func_t can_apply;
     * }
     */
    public static MemorySegment can_apply$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$398.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * H5Z_can_apply_func_t can_apply;
     * }
     */
    public static void can_apply$set(MemorySegment seg, MemorySegment x) {
        constants$398.const$3.set(seg, x);
    }
    public static MemorySegment can_apply$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$398.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void can_apply$set(MemorySegment seg, long index, MemorySegment x) {
        constants$398.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static H5Z_can_apply_func_t can_apply(MemorySegment segment, Arena scope) {
        return H5Z_can_apply_func_t.ofAddress(can_apply$get(segment), scope);
    }
    public static VarHandle set_local$VH() {
        return constants$398.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * H5Z_set_local_func_t set_local;
     * }
     */
    public static MemorySegment set_local$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$398.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * H5Z_set_local_func_t set_local;
     * }
     */
    public static void set_local$set(MemorySegment seg, MemorySegment x) {
        constants$398.const$4.set(seg, x);
    }
    public static MemorySegment set_local$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$398.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void set_local$set(MemorySegment seg, long index, MemorySegment x) {
        constants$398.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static H5Z_set_local_func_t set_local(MemorySegment segment, Arena scope) {
        return H5Z_set_local_func_t.ofAddress(set_local$get(segment), scope);
    }
    public static VarHandle filter$VH() {
        return constants$398.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * H5Z_func_t filter;
     * }
     */
    public static MemorySegment filter$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$398.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * H5Z_func_t filter;
     * }
     */
    public static void filter$set(MemorySegment seg, MemorySegment x) {
        constants$398.const$5.set(seg, x);
    }
    public static MemorySegment filter$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$398.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void filter$set(MemorySegment seg, long index, MemorySegment x) {
        constants$398.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static H5Z_func_t filter(MemorySegment segment, Arena scope) {
        return H5Z_func_t.ofAddress(filter$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


