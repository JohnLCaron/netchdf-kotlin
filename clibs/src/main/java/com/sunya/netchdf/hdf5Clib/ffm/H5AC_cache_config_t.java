// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct H5AC_cache_config_t {
 *     int version;
 *     hbool_t rpt_fcn_enabled;
 *     hbool_t open_trace_file;
 *     hbool_t close_trace_file;
 *     char trace_file_name[1025];
 *     hbool_t evictions_enabled;
 *     hbool_t set_initial_size;
 *     size_t initial_size;
 *     double min_clean_fraction;
 *     size_t max_size;
 *     size_t min_size;
 *     long epoch_length;
 *     enum H5C_cache_incr_mode incr_mode;
 *     double lower_hr_threshold;
 *     double increment;
 *     hbool_t apply_max_increment;
 *     size_t max_increment;
 *     enum H5C_cache_flash_incr_mode flash_incr_mode;
 *     double flash_multiple;
 *     double flash_threshold;
 *     enum H5C_cache_decr_mode decr_mode;
 *     double upper_hr_threshold;
 *     double decrement;
 *     hbool_t apply_max_decrement;
 *     size_t max_decrement;
 *     int epochs_before_eviction;
 *     hbool_t apply_empty_reserve;
 *     double empty_reserve;
 *     size_t dirty_bytes_threshold;
 *     int metadata_write_strategy;
 * };
 * }
 */
public class H5AC_cache_config_t {

    public static MemoryLayout $LAYOUT() {
        return constants$82.const$4;
    }
    public static VarHandle version$VH() {
        return constants$82.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int version;
     * }
     */
    public static int version$get(MemorySegment seg) {
        return (int)constants$82.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int version;
     * }
     */
    public static void version$set(MemorySegment seg, int x) {
        constants$82.const$5.set(seg, x);
    }
    public static int version$get(MemorySegment seg, long index) {
        return (int)constants$82.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void version$set(MemorySegment seg, long index, int x) {
        constants$82.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rpt_fcn_enabled$VH() {
        return constants$83.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * hbool_t rpt_fcn_enabled;
     * }
     */
    public static boolean rpt_fcn_enabled$get(MemorySegment seg) {
        return (boolean)constants$83.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * hbool_t rpt_fcn_enabled;
     * }
     */
    public static void rpt_fcn_enabled$set(MemorySegment seg, boolean x) {
        constants$83.const$0.set(seg, x);
    }
    public static boolean rpt_fcn_enabled$get(MemorySegment seg, long index) {
        return (boolean)constants$83.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void rpt_fcn_enabled$set(MemorySegment seg, long index, boolean x) {
        constants$83.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle open_trace_file$VH() {
        return constants$83.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * hbool_t open_trace_file;
     * }
     */
    public static boolean open_trace_file$get(MemorySegment seg) {
        return (boolean)constants$83.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * hbool_t open_trace_file;
     * }
     */
    public static void open_trace_file$set(MemorySegment seg, boolean x) {
        constants$83.const$1.set(seg, x);
    }
    public static boolean open_trace_file$get(MemorySegment seg, long index) {
        return (boolean)constants$83.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void open_trace_file$set(MemorySegment seg, long index, boolean x) {
        constants$83.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle close_trace_file$VH() {
        return constants$83.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * hbool_t close_trace_file;
     * }
     */
    public static boolean close_trace_file$get(MemorySegment seg) {
        return (boolean)constants$83.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * hbool_t close_trace_file;
     * }
     */
    public static void close_trace_file$set(MemorySegment seg, boolean x) {
        constants$83.const$2.set(seg, x);
    }
    public static boolean close_trace_file$get(MemorySegment seg, long index) {
        return (boolean)constants$83.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void close_trace_file$set(MemorySegment seg, long index, boolean x) {
        constants$83.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment trace_file_name$slice(MemorySegment seg) {
        return seg.asSlice(7, 1025);
    }
    public static VarHandle evictions_enabled$VH() {
        return constants$83.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * hbool_t evictions_enabled;
     * }
     */
    public static boolean evictions_enabled$get(MemorySegment seg) {
        return (boolean)constants$83.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * hbool_t evictions_enabled;
     * }
     */
    public static void evictions_enabled$set(MemorySegment seg, boolean x) {
        constants$83.const$3.set(seg, x);
    }
    public static boolean evictions_enabled$get(MemorySegment seg, long index) {
        return (boolean)constants$83.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void evictions_enabled$set(MemorySegment seg, long index, boolean x) {
        constants$83.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle set_initial_size$VH() {
        return constants$83.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * hbool_t set_initial_size;
     * }
     */
    public static boolean set_initial_size$get(MemorySegment seg) {
        return (boolean)constants$83.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * hbool_t set_initial_size;
     * }
     */
    public static void set_initial_size$set(MemorySegment seg, boolean x) {
        constants$83.const$4.set(seg, x);
    }
    public static boolean set_initial_size$get(MemorySegment seg, long index) {
        return (boolean)constants$83.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void set_initial_size$set(MemorySegment seg, long index, boolean x) {
        constants$83.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle initial_size$VH() {
        return constants$83.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t initial_size;
     * }
     */
    public static long initial_size$get(MemorySegment seg) {
        return (long)constants$83.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t initial_size;
     * }
     */
    public static void initial_size$set(MemorySegment seg, long x) {
        constants$83.const$5.set(seg, x);
    }
    public static long initial_size$get(MemorySegment seg, long index) {
        return (long)constants$83.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void initial_size$set(MemorySegment seg, long index, long x) {
        constants$83.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle min_clean_fraction$VH() {
        return constants$84.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double min_clean_fraction;
     * }
     */
    public static double min_clean_fraction$get(MemorySegment seg) {
        return (double)constants$84.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double min_clean_fraction;
     * }
     */
    public static void min_clean_fraction$set(MemorySegment seg, double x) {
        constants$84.const$0.set(seg, x);
    }
    public static double min_clean_fraction$get(MemorySegment seg, long index) {
        return (double)constants$84.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void min_clean_fraction$set(MemorySegment seg, long index, double x) {
        constants$84.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle max_size$VH() {
        return constants$84.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t max_size;
     * }
     */
    public static long max_size$get(MemorySegment seg) {
        return (long)constants$84.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t max_size;
     * }
     */
    public static void max_size$set(MemorySegment seg, long x) {
        constants$84.const$1.set(seg, x);
    }
    public static long max_size$get(MemorySegment seg, long index) {
        return (long)constants$84.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void max_size$set(MemorySegment seg, long index, long x) {
        constants$84.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle min_size$VH() {
        return constants$84.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t min_size;
     * }
     */
    public static long min_size$get(MemorySegment seg) {
        return (long)constants$84.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t min_size;
     * }
     */
    public static void min_size$set(MemorySegment seg, long x) {
        constants$84.const$2.set(seg, x);
    }
    public static long min_size$get(MemorySegment seg, long index) {
        return (long)constants$84.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void min_size$set(MemorySegment seg, long index, long x) {
        constants$84.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle epoch_length$VH() {
        return constants$84.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long epoch_length;
     * }
     */
    public static long epoch_length$get(MemorySegment seg) {
        return (long)constants$84.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long epoch_length;
     * }
     */
    public static void epoch_length$set(MemorySegment seg, long x) {
        constants$84.const$3.set(seg, x);
    }
    public static long epoch_length$get(MemorySegment seg, long index) {
        return (long)constants$84.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void epoch_length$set(MemorySegment seg, long index, long x) {
        constants$84.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle incr_mode$VH() {
        return constants$84.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum H5C_cache_incr_mode incr_mode;
     * }
     */
    public static int incr_mode$get(MemorySegment seg) {
        return (int)constants$84.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum H5C_cache_incr_mode incr_mode;
     * }
     */
    public static void incr_mode$set(MemorySegment seg, int x) {
        constants$84.const$4.set(seg, x);
    }
    public static int incr_mode$get(MemorySegment seg, long index) {
        return (int)constants$84.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void incr_mode$set(MemorySegment seg, long index, int x) {
        constants$84.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lower_hr_threshold$VH() {
        return constants$84.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double lower_hr_threshold;
     * }
     */
    public static double lower_hr_threshold$get(MemorySegment seg) {
        return (double)constants$84.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double lower_hr_threshold;
     * }
     */
    public static void lower_hr_threshold$set(MemorySegment seg, double x) {
        constants$84.const$5.set(seg, x);
    }
    public static double lower_hr_threshold$get(MemorySegment seg, long index) {
        return (double)constants$84.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void lower_hr_threshold$set(MemorySegment seg, long index, double x) {
        constants$84.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle increment$VH() {
        return constants$85.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double increment;
     * }
     */
    public static double increment$get(MemorySegment seg) {
        return (double)constants$85.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double increment;
     * }
     */
    public static void increment$set(MemorySegment seg, double x) {
        constants$85.const$0.set(seg, x);
    }
    public static double increment$get(MemorySegment seg, long index) {
        return (double)constants$85.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void increment$set(MemorySegment seg, long index, double x) {
        constants$85.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle apply_max_increment$VH() {
        return constants$85.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * hbool_t apply_max_increment;
     * }
     */
    public static boolean apply_max_increment$get(MemorySegment seg) {
        return (boolean)constants$85.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * hbool_t apply_max_increment;
     * }
     */
    public static void apply_max_increment$set(MemorySegment seg, boolean x) {
        constants$85.const$1.set(seg, x);
    }
    public static boolean apply_max_increment$get(MemorySegment seg, long index) {
        return (boolean)constants$85.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void apply_max_increment$set(MemorySegment seg, long index, boolean x) {
        constants$85.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle max_increment$VH() {
        return constants$85.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t max_increment;
     * }
     */
    public static long max_increment$get(MemorySegment seg) {
        return (long)constants$85.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t max_increment;
     * }
     */
    public static void max_increment$set(MemorySegment seg, long x) {
        constants$85.const$2.set(seg, x);
    }
    public static long max_increment$get(MemorySegment seg, long index) {
        return (long)constants$85.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void max_increment$set(MemorySegment seg, long index, long x) {
        constants$85.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flash_incr_mode$VH() {
        return constants$85.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum H5C_cache_flash_incr_mode flash_incr_mode;
     * }
     */
    public static int flash_incr_mode$get(MemorySegment seg) {
        return (int)constants$85.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum H5C_cache_flash_incr_mode flash_incr_mode;
     * }
     */
    public static void flash_incr_mode$set(MemorySegment seg, int x) {
        constants$85.const$3.set(seg, x);
    }
    public static int flash_incr_mode$get(MemorySegment seg, long index) {
        return (int)constants$85.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void flash_incr_mode$set(MemorySegment seg, long index, int x) {
        constants$85.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flash_multiple$VH() {
        return constants$85.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double flash_multiple;
     * }
     */
    public static double flash_multiple$get(MemorySegment seg) {
        return (double)constants$85.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double flash_multiple;
     * }
     */
    public static void flash_multiple$set(MemorySegment seg, double x) {
        constants$85.const$4.set(seg, x);
    }
    public static double flash_multiple$get(MemorySegment seg, long index) {
        return (double)constants$85.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void flash_multiple$set(MemorySegment seg, long index, double x) {
        constants$85.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flash_threshold$VH() {
        return constants$85.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double flash_threshold;
     * }
     */
    public static double flash_threshold$get(MemorySegment seg) {
        return (double)constants$85.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double flash_threshold;
     * }
     */
    public static void flash_threshold$set(MemorySegment seg, double x) {
        constants$85.const$5.set(seg, x);
    }
    public static double flash_threshold$get(MemorySegment seg, long index) {
        return (double)constants$85.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void flash_threshold$set(MemorySegment seg, long index, double x) {
        constants$85.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle decr_mode$VH() {
        return constants$86.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum H5C_cache_decr_mode decr_mode;
     * }
     */
    public static int decr_mode$get(MemorySegment seg) {
        return (int)constants$86.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum H5C_cache_decr_mode decr_mode;
     * }
     */
    public static void decr_mode$set(MemorySegment seg, int x) {
        constants$86.const$0.set(seg, x);
    }
    public static int decr_mode$get(MemorySegment seg, long index) {
        return (int)constants$86.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void decr_mode$set(MemorySegment seg, long index, int x) {
        constants$86.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle upper_hr_threshold$VH() {
        return constants$86.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double upper_hr_threshold;
     * }
     */
    public static double upper_hr_threshold$get(MemorySegment seg) {
        return (double)constants$86.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double upper_hr_threshold;
     * }
     */
    public static void upper_hr_threshold$set(MemorySegment seg, double x) {
        constants$86.const$1.set(seg, x);
    }
    public static double upper_hr_threshold$get(MemorySegment seg, long index) {
        return (double)constants$86.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void upper_hr_threshold$set(MemorySegment seg, long index, double x) {
        constants$86.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle decrement$VH() {
        return constants$86.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double decrement;
     * }
     */
    public static double decrement$get(MemorySegment seg) {
        return (double)constants$86.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double decrement;
     * }
     */
    public static void decrement$set(MemorySegment seg, double x) {
        constants$86.const$2.set(seg, x);
    }
    public static double decrement$get(MemorySegment seg, long index) {
        return (double)constants$86.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void decrement$set(MemorySegment seg, long index, double x) {
        constants$86.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle apply_max_decrement$VH() {
        return constants$86.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * hbool_t apply_max_decrement;
     * }
     */
    public static boolean apply_max_decrement$get(MemorySegment seg) {
        return (boolean)constants$86.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * hbool_t apply_max_decrement;
     * }
     */
    public static void apply_max_decrement$set(MemorySegment seg, boolean x) {
        constants$86.const$3.set(seg, x);
    }
    public static boolean apply_max_decrement$get(MemorySegment seg, long index) {
        return (boolean)constants$86.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void apply_max_decrement$set(MemorySegment seg, long index, boolean x) {
        constants$86.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle max_decrement$VH() {
        return constants$86.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t max_decrement;
     * }
     */
    public static long max_decrement$get(MemorySegment seg) {
        return (long)constants$86.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t max_decrement;
     * }
     */
    public static void max_decrement$set(MemorySegment seg, long x) {
        constants$86.const$4.set(seg, x);
    }
    public static long max_decrement$get(MemorySegment seg, long index) {
        return (long)constants$86.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void max_decrement$set(MemorySegment seg, long index, long x) {
        constants$86.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle epochs_before_eviction$VH() {
        return constants$86.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int epochs_before_eviction;
     * }
     */
    public static int epochs_before_eviction$get(MemorySegment seg) {
        return (int)constants$86.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int epochs_before_eviction;
     * }
     */
    public static void epochs_before_eviction$set(MemorySegment seg, int x) {
        constants$86.const$5.set(seg, x);
    }
    public static int epochs_before_eviction$get(MemorySegment seg, long index) {
        return (int)constants$86.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void epochs_before_eviction$set(MemorySegment seg, long index, int x) {
        constants$86.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle apply_empty_reserve$VH() {
        return constants$87.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * hbool_t apply_empty_reserve;
     * }
     */
    public static boolean apply_empty_reserve$get(MemorySegment seg) {
        return (boolean)constants$87.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * hbool_t apply_empty_reserve;
     * }
     */
    public static void apply_empty_reserve$set(MemorySegment seg, boolean x) {
        constants$87.const$0.set(seg, x);
    }
    public static boolean apply_empty_reserve$get(MemorySegment seg, long index) {
        return (boolean)constants$87.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void apply_empty_reserve$set(MemorySegment seg, long index, boolean x) {
        constants$87.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle empty_reserve$VH() {
        return constants$87.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double empty_reserve;
     * }
     */
    public static double empty_reserve$get(MemorySegment seg) {
        return (double)constants$87.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double empty_reserve;
     * }
     */
    public static void empty_reserve$set(MemorySegment seg, double x) {
        constants$87.const$1.set(seg, x);
    }
    public static double empty_reserve$get(MemorySegment seg, long index) {
        return (double)constants$87.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void empty_reserve$set(MemorySegment seg, long index, double x) {
        constants$87.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dirty_bytes_threshold$VH() {
        return constants$87.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t dirty_bytes_threshold;
     * }
     */
    public static long dirty_bytes_threshold$get(MemorySegment seg) {
        return (long)constants$87.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t dirty_bytes_threshold;
     * }
     */
    public static void dirty_bytes_threshold$set(MemorySegment seg, long x) {
        constants$87.const$2.set(seg, x);
    }
    public static long dirty_bytes_threshold$get(MemorySegment seg, long index) {
        return (long)constants$87.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dirty_bytes_threshold$set(MemorySegment seg, long index, long x) {
        constants$87.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle metadata_write_strategy$VH() {
        return constants$87.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int metadata_write_strategy;
     * }
     */
    public static int metadata_write_strategy$get(MemorySegment seg) {
        return (int)constants$87.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int metadata_write_strategy;
     * }
     */
    public static void metadata_write_strategy$set(MemorySegment seg, int x) {
        constants$87.const$3.set(seg, x);
    }
    public static int metadata_write_strategy$get(MemorySegment seg, long index) {
        return (int)constants$87.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void metadata_write_strategy$set(MemorySegment seg, long index, int x) {
        constants$87.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


