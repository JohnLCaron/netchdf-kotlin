// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$302 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$302() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(H5MM_free_t.class, "apply", constants$113.const$1);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$113.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "H5Sclose",
        constants$19.const$1
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "H5Scombine_hyperslab",
        constants$302.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_LONG,
        JAVA_INT,
        JAVA_LONG
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "H5Scombine_select",
        constants$302.const$5
    );
}


