// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$326 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$326() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "H5Pget_filter2",
        constants$326.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "H5Pget_filter_by_id2",
        constants$326.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "H5Pget_nfilters",
        constants$19.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "H5Pget_obj_track_times",
        constants$17.const$5
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        JAVA_INT,
        JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "H5Pmodify_filter",
        constants$326.const$5
    );
}


