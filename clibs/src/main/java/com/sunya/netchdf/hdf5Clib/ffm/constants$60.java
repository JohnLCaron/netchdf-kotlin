// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$60 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$60() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "H5Topen_async",
        constants$28.const$0
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        JAVA_LONG,
        JAVA_LONG,
        JAVA_LONG
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "H5Tcommit_anon",
        constants$60.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "H5Tget_create_plist",
        constants$0.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "H5Tcommitted",
        constants$19.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "H5Tencode",
        constants$36.const$1
    );
}


