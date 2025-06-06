// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct H5VL_link_get_args_t {
 *     H5VL_link_get_t op_type;
 *     union  args;
 * };
 * }
 */
public class H5VL_link_get_args_t {

    public static MemoryLayout $LAYOUT() {
        return constants$244.const$5;
    }
    public static VarHandle op_type$VH() {
        return constants$245.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * H5VL_link_get_t op_type;
     * }
     */
    public static int op_type$get(MemorySegment seg) {
        return (int)constants$245.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * H5VL_link_get_t op_type;
     * }
     */
    public static void op_type$set(MemorySegment seg, int x) {
        constants$245.const$0.set(seg, x);
    }
    public static int op_type$get(MemorySegment seg, long index) {
        return (int)constants$245.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void op_type$set(MemorySegment seg, long index, int x) {
        constants$245.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union {
     *     struct  get_info;
     *     struct  get_name;
     *     struct  get_val;
     * };
     * }
     */
    public static final class args {

        // Suppresses default constructor, ensuring non-instantiability.
        private args() {}
        public static MemoryLayout $LAYOUT() {
            return constants$245.const$1;
        }
        /**
         * {@snippet :
         * struct {
         *     H5L_info2_t* linfo;
         * };
         * }
         */
        public static final class get_info {

            // Suppresses default constructor, ensuring non-instantiability.
            private get_info() {}
            public static MemoryLayout $LAYOUT() {
                return constants$245.const$2;
            }
            public static VarHandle linfo$VH() {
                return constants$245.const$3;
            }
            /**
             * Getter for field:
             * {@snippet :
             * H5L_info2_t* linfo;
             * }
             */
            public static MemorySegment linfo$get(MemorySegment seg) {
                return (java.lang.foreign.MemorySegment)constants$245.const$3.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * H5L_info2_t* linfo;
             * }
             */
            public static void linfo$set(MemorySegment seg, MemorySegment x) {
                constants$245.const$3.set(seg, x);
            }
            public static MemorySegment linfo$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemorySegment)constants$245.const$3.get(seg.asSlice(index*sizeof()));
            }
            public static void linfo$set(MemorySegment seg, long index, MemorySegment x) {
                constants$245.const$3.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
        }

        public static MemorySegment get_info$slice(MemorySegment seg) {
            return seg.asSlice(0, 8);
        }
        /**
         * {@snippet :
         * struct {
         *     size_t name_size;
         *     char* name;
         *     size_t* name_len;
         * };
         * }
         */
        public static final class get_name {

            // Suppresses default constructor, ensuring non-instantiability.
            private get_name() {}
            public static MemoryLayout $LAYOUT() {
                return constants$245.const$4;
            }
            public static VarHandle name_size$VH() {
                return constants$245.const$5;
            }
            /**
             * Getter for field:
             * {@snippet :
             * size_t name_size;
             * }
             */
            public static long name_size$get(MemorySegment seg) {
                return (long)constants$245.const$5.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * size_t name_size;
             * }
             */
            public static void name_size$set(MemorySegment seg, long x) {
                constants$245.const$5.set(seg, x);
            }
            public static long name_size$get(MemorySegment seg, long index) {
                return (long)constants$245.const$5.get(seg.asSlice(index*sizeof()));
            }
            public static void name_size$set(MemorySegment seg, long index, long x) {
                constants$245.const$5.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle name$VH() {
                return constants$246.const$0;
            }
            /**
             * Getter for field:
             * {@snippet :
             * char* name;
             * }
             */
            public static MemorySegment name$get(MemorySegment seg) {
                return (java.lang.foreign.MemorySegment)constants$246.const$0.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * char* name;
             * }
             */
            public static void name$set(MemorySegment seg, MemorySegment x) {
                constants$246.const$0.set(seg, x);
            }
            public static MemorySegment name$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemorySegment)constants$246.const$0.get(seg.asSlice(index*sizeof()));
            }
            public static void name$set(MemorySegment seg, long index, MemorySegment x) {
                constants$246.const$0.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle name_len$VH() {
                return constants$246.const$1;
            }
            /**
             * Getter for field:
             * {@snippet :
             * size_t* name_len;
             * }
             */
            public static MemorySegment name_len$get(MemorySegment seg) {
                return (java.lang.foreign.MemorySegment)constants$246.const$1.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * size_t* name_len;
             * }
             */
            public static void name_len$set(MemorySegment seg, MemorySegment x) {
                constants$246.const$1.set(seg, x);
            }
            public static MemorySegment name_len$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemorySegment)constants$246.const$1.get(seg.asSlice(index*sizeof()));
            }
            public static void name_len$set(MemorySegment seg, long index, MemorySegment x) {
                constants$246.const$1.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
        }

        public static MemorySegment get_name$slice(MemorySegment seg) {
            return seg.asSlice(0, 24);
        }
        /**
         * {@snippet :
         * struct {
         *     size_t buf_size;
         *     void* buf;
         * };
         * }
         */
        public static final class get_val {

            // Suppresses default constructor, ensuring non-instantiability.
            private get_val() {}
            public static MemoryLayout $LAYOUT() {
                return constants$246.const$2;
            }
            public static VarHandle buf_size$VH() {
                return constants$246.const$3;
            }
            /**
             * Getter for field:
             * {@snippet :
             * size_t buf_size;
             * }
             */
            public static long buf_size$get(MemorySegment seg) {
                return (long)constants$246.const$3.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * size_t buf_size;
             * }
             */
            public static void buf_size$set(MemorySegment seg, long x) {
                constants$246.const$3.set(seg, x);
            }
            public static long buf_size$get(MemorySegment seg, long index) {
                return (long)constants$246.const$3.get(seg.asSlice(index*sizeof()));
            }
            public static void buf_size$set(MemorySegment seg, long index, long x) {
                constants$246.const$3.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle buf$VH() {
                return constants$246.const$4;
            }
            /**
             * Getter for field:
             * {@snippet :
             * void* buf;
             * }
             */
            public static MemorySegment buf$get(MemorySegment seg) {
                return (java.lang.foreign.MemorySegment)constants$246.const$4.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * void* buf;
             * }
             */
            public static void buf$set(MemorySegment seg, MemorySegment x) {
                constants$246.const$4.set(seg, x);
            }
            public static MemorySegment buf$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemorySegment)constants$246.const$4.get(seg.asSlice(index*sizeof()));
            }
            public static void buf$set(MemorySegment seg, long index, MemorySegment x) {
                constants$246.const$4.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
        }

        public static MemorySegment get_val$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment args$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


