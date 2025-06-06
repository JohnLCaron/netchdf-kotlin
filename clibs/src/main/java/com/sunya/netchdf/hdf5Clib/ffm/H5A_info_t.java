// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     hbool_t corder_valid;
 *     H5O_msg_crt_idx_t corder;
 *     H5T_cset_t cset;
 *     hsize_t data_size;
 * };
 * }
 */
public class H5A_info_t {

    public static MemoryLayout $LAYOUT() {
        return constants$72.const$1;
    }
    public static VarHandle corder_valid$VH() {
        return constants$72.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * hbool_t corder_valid;
     * }
     */
    public static boolean corder_valid$get(MemorySegment seg) {
        return (boolean)constants$72.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * hbool_t corder_valid;
     * }
     */
    public static void corder_valid$set(MemorySegment seg, boolean x) {
        constants$72.const$2.set(seg, x);
    }
    public static boolean corder_valid$get(MemorySegment seg, long index) {
        return (boolean)constants$72.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void corder_valid$set(MemorySegment seg, long index, boolean x) {
        constants$72.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle corder$VH() {
        return constants$72.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * H5O_msg_crt_idx_t corder;
     * }
     */
    public static int corder$get(MemorySegment seg) {
        return (int)constants$72.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * H5O_msg_crt_idx_t corder;
     * }
     */
    public static void corder$set(MemorySegment seg, int x) {
        constants$72.const$3.set(seg, x);
    }
    public static int corder$get(MemorySegment seg, long index) {
        return (int)constants$72.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void corder$set(MemorySegment seg, long index, int x) {
        constants$72.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cset$VH() {
        return constants$72.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * H5T_cset_t cset;
     * }
     */
    public static int cset$get(MemorySegment seg) {
        return (int)constants$72.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * H5T_cset_t cset;
     * }
     */
    public static void cset$set(MemorySegment seg, int x) {
        constants$72.const$4.set(seg, x);
    }
    public static int cset$get(MemorySegment seg, long index) {
        return (int)constants$72.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cset$set(MemorySegment seg, long index, int x) {
        constants$72.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle data_size$VH() {
        return constants$72.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * hsize_t data_size;
     * }
     */
    public static long data_size$get(MemorySegment seg) {
        return (long)constants$72.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * hsize_t data_size;
     * }
     */
    public static void data_size$set(MemorySegment seg, long x) {
        constants$72.const$5.set(seg, x);
    }
    public static long data_size$get(MemorySegment seg, long index) {
        return (long)constants$72.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void data_size$set(MemorySegment seg, long index, long x) {
        constants$72.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


