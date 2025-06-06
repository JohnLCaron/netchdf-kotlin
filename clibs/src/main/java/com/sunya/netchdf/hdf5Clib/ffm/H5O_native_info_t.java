// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct H5O_native_info_t {
 *     H5O_hdr_info_t hdr;
 *     struct  meta_size;
 * };
 * }
 */
public class H5O_native_info_t {

    public static MemoryLayout $LAYOUT() {
        return constants$26.const$4;
    }
    public static MemorySegment hdr$slice(MemorySegment seg) {
        return seg.asSlice(0, 64);
    }
    /**
     * {@snippet :
     * struct {
     *     H5_ih_info_t obj;
     *     H5_ih_info_t attr;
     * };
     * }
     */
    public static final class meta_size {

        // Suppresses default constructor, ensuring non-instantiability.
        private meta_size() {}
        public static MemoryLayout $LAYOUT() {
            return constants$26.const$5;
        }
        public static MemorySegment obj$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static MemorySegment attr$slice(MemorySegment seg) {
            return seg.asSlice(16, 16);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment meta_size$slice(MemorySegment seg) {
        return seg.asSlice(64, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


