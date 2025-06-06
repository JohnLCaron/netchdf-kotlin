// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct H5VL_blob_class_t {
 *     herr_t (*put)(void*,void*,size_t,void*,void*);
 *     herr_t (*get)(void*,void*,void*,size_t,void*);
 *     herr_t (*specific)(void*,void*,H5VL_blob_specific_args_t*);
 *     herr_t (*optional)(void*,void*,H5VL_optional_args_t*);
 * };
 * }
 */
public class H5VL_blob_class_t {

    public static MemoryLayout $LAYOUT() {
        return constants$284.const$5;
    }
    /**
     * {@snippet :
 * herr_t (*put)(void*,void*,size_t,void*,void*);
     * }
     */
    public interface put {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, long _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(put fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$285.const$1, fi, constants$285.const$0, scope);
        }
        static put ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, long __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (int)constants$285.const$2.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle put$VH() {
        return constants$285.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * herr_t (*put)(void*,void*,size_t,void*,void*);
     * }
     */
    public static MemorySegment put$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$285.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * herr_t (*put)(void*,void*,size_t,void*,void*);
     * }
     */
    public static void put$set(MemorySegment seg, MemorySegment x) {
        constants$285.const$3.set(seg, x);
    }
    public static MemorySegment put$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$285.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void put$set(MemorySegment seg, long index, MemorySegment x) {
        constants$285.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static put put(MemorySegment segment, Arena scope) {
        return put.ofAddress(put$get(segment), scope);
    }
    /**
     * {@snippet :
 * herr_t (*get)(void*,void*,void*,size_t,void*);
     * }
     */
    public interface get {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, long _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(get fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$285.const$4, fi, constants$263.const$1, scope);
        }
        static get ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, long __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (int)constants$263.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get$VH() {
        return constants$285.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * herr_t (*get)(void*,void*,void*,size_t,void*);
     * }
     */
    public static MemorySegment get$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$285.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * herr_t (*get)(void*,void*,void*,size_t,void*);
     * }
     */
    public static void get$set(MemorySegment seg, MemorySegment x) {
        constants$285.const$5.set(seg, x);
    }
    public static MemorySegment get$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$285.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void get$set(MemorySegment seg, long index, MemorySegment x) {
        constants$285.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static get get(MemorySegment segment, Arena scope) {
        return get.ofAddress(get$get(segment), scope);
    }
    /**
     * {@snippet :
 * herr_t (*specific)(void*,void*,H5VL_blob_specific_args_t*);
     * }
     */
    public interface specific {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(specific fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$286.const$0, fi, constants$15.const$0, scope);
        }
        static specific ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)constants$89.const$2.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle specific$VH() {
        return constants$286.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * herr_t (*specific)(void*,void*,H5VL_blob_specific_args_t*);
     * }
     */
    public static MemorySegment specific$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$286.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * herr_t (*specific)(void*,void*,H5VL_blob_specific_args_t*);
     * }
     */
    public static void specific$set(MemorySegment seg, MemorySegment x) {
        constants$286.const$1.set(seg, x);
    }
    public static MemorySegment specific$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$286.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void specific$set(MemorySegment seg, long index, MemorySegment x) {
        constants$286.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static specific specific(MemorySegment segment, Arena scope) {
        return specific.ofAddress(specific$get(segment), scope);
    }
    /**
     * {@snippet :
 * herr_t (*optional)(void*,void*,H5VL_optional_args_t*);
     * }
     */
    public interface optional {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(optional fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$286.const$2, fi, constants$15.const$0, scope);
        }
        static optional ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)constants$89.const$2.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle optional$VH() {
        return constants$286.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * herr_t (*optional)(void*,void*,H5VL_optional_args_t*);
     * }
     */
    public static MemorySegment optional$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$286.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * herr_t (*optional)(void*,void*,H5VL_optional_args_t*);
     * }
     */
    public static void optional$set(MemorySegment seg, MemorySegment x) {
        constants$286.const$3.set(seg, x);
    }
    public static MemorySegment optional$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$286.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void optional$set(MemorySegment seg, long index, MemorySegment x) {
        constants$286.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static optional optional(MemorySegment segment, Arena scope) {
        return optional.ofAddress(optional$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


