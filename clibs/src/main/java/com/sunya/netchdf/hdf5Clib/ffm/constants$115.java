// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$115 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$115() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "vsprintf",
        constants$15.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandleVariadic(
        "snprintf",
        constants$17.const$2
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "vsnprintf",
        constants$115.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "vasprintf",
        constants$15.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandleVariadic(
        "__asprintf",
        constants$13.const$4
    );
}


