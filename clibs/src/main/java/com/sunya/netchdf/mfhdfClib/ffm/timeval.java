// Generated by jextract

package com.sunya.netchdf.mfhdfClib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct timeval {
 *     __time_t tv_sec;
 *     __suseconds_t tv_usec;
 * };
 * }
 */
public class timeval {

    public static MemoryLayout $LAYOUT() {
        return constants$41.const$4;
    }
    public static VarHandle tv_sec$VH() {
        return constants$41.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __time_t tv_sec;
     * }
     */
    public static long tv_sec$get(MemorySegment seg) {
        return (long)constants$41.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __time_t tv_sec;
     * }
     */
    public static void tv_sec$set(MemorySegment seg, long x) {
        constants$41.const$5.set(seg, x);
    }
    public static long tv_sec$get(MemorySegment seg, long index) {
        return (long)constants$41.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void tv_sec$set(MemorySegment seg, long index, long x) {
        constants$41.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle tv_usec$VH() {
        return constants$42.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __suseconds_t tv_usec;
     * }
     */
    public static long tv_usec$get(MemorySegment seg) {
        return (long)constants$42.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __suseconds_t tv_usec;
     * }
     */
    public static void tv_usec$set(MemorySegment seg, long x) {
        constants$42.const$0.set(seg, x);
    }
    public static long tv_usec$get(MemorySegment seg, long index) {
        return (long)constants$42.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void tv_usec$set(MemorySegment seg, long index, long x) {
        constants$42.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


