// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$387 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$387() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(H5L_traverse_func_t.class, "apply", constants$386.const$5);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$386.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(H5L_delete_func_t.class, "apply", constants$386.const$1);
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(H5L_query_func_t.class, "apply", constants$387.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$387.const$3
    );
}


