// Generated by jextract

package com.sunya.netchdf.mfhdfClib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$73 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$73() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "strxfrm_l",
        constants$73.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "strdup",
        constants$20.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "strndup",
        constants$59.const$4
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "strchr",
        constants$73.const$4
    );
}


