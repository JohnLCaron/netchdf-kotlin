// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$34 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$34() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "H5Ovisit_by_name3",
        constants$34.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "H5Oclose",
        constants$19.const$1
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG,
        JAVA_LONG
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "H5Oclose_async",
        constants$34.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "H5Oflush",
        constants$19.const$1
    );
}


