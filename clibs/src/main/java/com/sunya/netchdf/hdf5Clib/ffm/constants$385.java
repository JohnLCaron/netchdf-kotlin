// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$385 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$385() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "H5FDctl",
        constants$96.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(H5I_future_realize_func_t.class, "apply", constants$13.const$4);
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(H5I_future_discard_func_t.class, "apply", constants$15.const$4);
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "H5Iregister_future",
        constants$385.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(H5L_create_func_t.class, "apply", constants$97.const$1);
}


