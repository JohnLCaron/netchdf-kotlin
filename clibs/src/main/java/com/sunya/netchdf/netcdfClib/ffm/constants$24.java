// Generated by jextract

package com.sunya.netchdf.netcdfClib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$24 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$24() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "nc_inq_atttype",
        constants$7.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "nc_inq_attlen",
        constants$7.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "nc_inq_attname",
        constants$8.const$4
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "nc_copy_att",
        constants$24.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "nc_rename_att",
        constants$7.const$0
    );
}


