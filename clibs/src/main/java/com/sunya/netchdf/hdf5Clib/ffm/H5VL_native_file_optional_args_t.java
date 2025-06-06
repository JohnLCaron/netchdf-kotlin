// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union H5VL_native_file_optional_args_t {
 *     H5VL_native_file_get_file_image_t get_file_image;
 *     H5VL_native_file_get_free_sections_t get_free_sections;
 *     H5VL_native_file_get_freespace_t get_freespace;
 *     H5VL_native_file_get_info_t get_info;
 *     struct  get_mdc_config;
 *     struct  get_mdc_hit_rate;
 *     H5VL_native_file_get_mdc_size_t get_mdc_size;
 *     struct  get_size;
 *     H5VL_native_file_get_vfd_handle_t get_vfd_handle;
 *     struct  set_mdc_config;
 *     struct  get_metadata_read_retry_info;
 *     H5VL_native_file_get_mdc_logging_status_t get_mdc_logging_status;
 *     H5VL_native_file_get_page_buffering_stats_t get_page_buffering_stats;
 *     H5VL_native_file_get_mdc_image_info_t get_mdc_image_info;
 *     struct  get_eoa;
 *     struct  increment_filesize;
 *     H5VL_native_file_set_libver_bounds_t set_libver_bounds;
 *     struct  get_min_dset_ohdr_flag;
 *     struct  set_min_dset_ohdr_flag;
 * };
 * }
 */
public class H5VL_native_file_optional_args_t {

    public static MemoryLayout $LAYOUT() {
        return constants$428.const$5;
    }
    public static MemorySegment get_file_image$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    public static MemorySegment get_free_sections$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    public static MemorySegment get_freespace$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment get_info$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    /**
     * {@snippet :
     * struct {
     *     H5AC_cache_config_t* config;
     * };
     * }
     */
    public static final class get_mdc_config {

        // Suppresses default constructor, ensuring non-instantiability.
        private get_mdc_config() {}
        public static MemoryLayout $LAYOUT() {
            return constants$429.const$0;
        }
        public static VarHandle config$VH() {
            return constants$429.const$1;
        }
        /**
         * Getter for field:
         * {@snippet :
         * H5AC_cache_config_t* config;
         * }
         */
        public static MemorySegment config$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)constants$429.const$1.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * H5AC_cache_config_t* config;
         * }
         */
        public static void config$set(MemorySegment seg, MemorySegment x) {
            constants$429.const$1.set(seg, x);
        }
        public static MemorySegment config$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)constants$429.const$1.get(seg.asSlice(index*sizeof()));
        }
        public static void config$set(MemorySegment seg, long index, MemorySegment x) {
            constants$429.const$1.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment get_mdc_config$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    /**
     * {@snippet :
     * struct {
     *     double* hit_rate;
     * };
     * }
     */
    public static final class get_mdc_hit_rate {

        // Suppresses default constructor, ensuring non-instantiability.
        private get_mdc_hit_rate() {}
        public static MemoryLayout $LAYOUT() {
            return constants$429.const$2;
        }
        public static VarHandle hit_rate$VH() {
            return constants$429.const$3;
        }
        /**
         * Getter for field:
         * {@snippet :
         * double* hit_rate;
         * }
         */
        public static MemorySegment hit_rate$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)constants$429.const$3.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * double* hit_rate;
         * }
         */
        public static void hit_rate$set(MemorySegment seg, MemorySegment x) {
            constants$429.const$3.set(seg, x);
        }
        public static MemorySegment hit_rate$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)constants$429.const$3.get(seg.asSlice(index*sizeof()));
        }
        public static void hit_rate$set(MemorySegment seg, long index, MemorySegment x) {
            constants$429.const$3.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment get_mdc_hit_rate$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment get_mdc_size$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    /**
     * {@snippet :
     * struct {
     *     hsize_t* size;
     * };
     * }
     */
    public static final class get_size {

        // Suppresses default constructor, ensuring non-instantiability.
        private get_size() {}
        public static MemoryLayout $LAYOUT() {
            return constants$228.const$4;
        }
        public static VarHandle size$VH() {
            return constants$429.const$4;
        }
        /**
         * Getter for field:
         * {@snippet :
         * hsize_t* size;
         * }
         */
        public static MemorySegment size$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)constants$429.const$4.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * hsize_t* size;
         * }
         */
        public static void size$set(MemorySegment seg, MemorySegment x) {
            constants$429.const$4.set(seg, x);
        }
        public static MemorySegment size$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)constants$429.const$4.get(seg.asSlice(index*sizeof()));
        }
        public static void size$set(MemorySegment seg, long index, MemorySegment x) {
            constants$429.const$4.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment get_size$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment get_vfd_handle$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    /**
     * {@snippet :
     * struct {
     *     const H5AC_cache_config_t* config;
     * };
     * }
     */
    public static final class set_mdc_config {

        // Suppresses default constructor, ensuring non-instantiability.
        private set_mdc_config() {}
        public static MemoryLayout $LAYOUT() {
            return constants$429.const$0;
        }
        public static VarHandle config$VH() {
            return constants$429.const$5;
        }
        /**
         * Getter for field:
         * {@snippet :
         * const H5AC_cache_config_t* config;
         * }
         */
        public static MemorySegment config$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)constants$429.const$5.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * const H5AC_cache_config_t* config;
         * }
         */
        public static void config$set(MemorySegment seg, MemorySegment x) {
            constants$429.const$5.set(seg, x);
        }
        public static MemorySegment config$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)constants$429.const$5.get(seg.asSlice(index*sizeof()));
        }
        public static void config$set(MemorySegment seg, long index, MemorySegment x) {
            constants$429.const$5.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment set_mdc_config$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    /**
     * {@snippet :
     * struct {
     *     H5F_retry_info_t* info;
     * };
     * }
     */
    public static final class get_metadata_read_retry_info {

        // Suppresses default constructor, ensuring non-instantiability.
        private get_metadata_read_retry_info() {}
        public static MemoryLayout $LAYOUT() {
            return constants$234.const$5;
        }
        public static VarHandle info$VH() {
            return constants$430.const$0;
        }
        /**
         * Getter for field:
         * {@snippet :
         * H5F_retry_info_t* info;
         * }
         */
        public static MemorySegment info$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)constants$430.const$0.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * H5F_retry_info_t* info;
         * }
         */
        public static void info$set(MemorySegment seg, MemorySegment x) {
            constants$430.const$0.set(seg, x);
        }
        public static MemorySegment info$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)constants$430.const$0.get(seg.asSlice(index*sizeof()));
        }
        public static void info$set(MemorySegment seg, long index, MemorySegment x) {
            constants$430.const$0.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment get_metadata_read_retry_info$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment get_mdc_logging_status$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment get_page_buffering_stats$slice(MemorySegment seg) {
        return seg.asSlice(0, 40);
    }
    public static MemorySegment get_mdc_image_info$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    /**
     * {@snippet :
     * struct {
     *     haddr_t* eoa;
     * };
     * }
     */
    public static final class get_eoa {

        // Suppresses default constructor, ensuring non-instantiability.
        private get_eoa() {}
        public static MemoryLayout $LAYOUT() {
            return constants$430.const$1;
        }
        public static VarHandle eoa$VH() {
            return constants$430.const$2;
        }
        /**
         * Getter for field:
         * {@snippet :
         * haddr_t* eoa;
         * }
         */
        public static MemorySegment eoa$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)constants$430.const$2.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * haddr_t* eoa;
         * }
         */
        public static void eoa$set(MemorySegment seg, MemorySegment x) {
            constants$430.const$2.set(seg, x);
        }
        public static MemorySegment eoa$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)constants$430.const$2.get(seg.asSlice(index*sizeof()));
        }
        public static void eoa$set(MemorySegment seg, long index, MemorySegment x) {
            constants$430.const$2.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment get_eoa$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    /**
     * {@snippet :
     * struct {
     *     hsize_t increment;
     * };
     * }
     */
    public static final class increment_filesize {

        // Suppresses default constructor, ensuring non-instantiability.
        private increment_filesize() {}
        public static MemoryLayout $LAYOUT() {
            return constants$430.const$3;
        }
        public static VarHandle increment$VH() {
            return constants$430.const$4;
        }
        /**
         * Getter for field:
         * {@snippet :
         * hsize_t increment;
         * }
         */
        public static long increment$get(MemorySegment seg) {
            return (long)constants$430.const$4.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * hsize_t increment;
         * }
         */
        public static void increment$set(MemorySegment seg, long x) {
            constants$430.const$4.set(seg, x);
        }
        public static long increment$get(MemorySegment seg, long index) {
            return (long)constants$430.const$4.get(seg.asSlice(index*sizeof()));
        }
        public static void increment$set(MemorySegment seg, long index, long x) {
            constants$430.const$4.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment increment_filesize$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment set_libver_bounds$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    /**
     * {@snippet :
     * struct {
     *     hbool_t* minimize;
     * };
     * }
     */
    public static final class get_min_dset_ohdr_flag {

        // Suppresses default constructor, ensuring non-instantiability.
        private get_min_dset_ohdr_flag() {}
        public static MemoryLayout $LAYOUT() {
            return constants$430.const$5;
        }
        public static VarHandle minimize$VH() {
            return constants$431.const$0;
        }
        /**
         * Getter for field:
         * {@snippet :
         * hbool_t* minimize;
         * }
         */
        public static MemorySegment minimize$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)constants$431.const$0.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * hbool_t* minimize;
         * }
         */
        public static void minimize$set(MemorySegment seg, MemorySegment x) {
            constants$431.const$0.set(seg, x);
        }
        public static MemorySegment minimize$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)constants$431.const$0.get(seg.asSlice(index*sizeof()));
        }
        public static void minimize$set(MemorySegment seg, long index, MemorySegment x) {
            constants$431.const$0.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment get_min_dset_ohdr_flag$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    /**
     * {@snippet :
     * struct {
     *     hbool_t minimize;
     * };
     * }
     */
    public static final class set_min_dset_ohdr_flag {

        // Suppresses default constructor, ensuring non-instantiability.
        private set_min_dset_ohdr_flag() {}
        public static MemoryLayout $LAYOUT() {
            return constants$431.const$1;
        }
        public static VarHandle minimize$VH() {
            return constants$431.const$2;
        }
        /**
         * Getter for field:
         * {@snippet :
         * hbool_t minimize;
         * }
         */
        public static boolean minimize$get(MemorySegment seg) {
            return (boolean)constants$431.const$2.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * hbool_t minimize;
         * }
         */
        public static void minimize$set(MemorySegment seg, boolean x) {
            constants$431.const$2.set(seg, x);
        }
        public static boolean minimize$get(MemorySegment seg, long index) {
            return (boolean)constants$431.const$2.get(seg.asSlice(index*sizeof()));
        }
        public static void minimize$set(MemorySegment seg, long index, boolean x) {
            constants$431.const$2.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment set_min_dset_ohdr_flag$slice(MemorySegment seg) {
        return seg.asSlice(0, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


