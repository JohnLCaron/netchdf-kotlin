// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$106 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$106() {}
    static final VarHandle const$0 = constants$101.const$5.varHandle(MemoryLayout.PathElement.groupElement("_freeres_buf"));
    static final VarHandle const$1 = constants$101.const$5.varHandle(MemoryLayout.PathElement.groupElement("__pad5"));
    static final VarHandle const$2 = constants$101.const$5.varHandle(MemoryLayout.PathElement.groupElement("_mode"));
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(cookie_read_function_t.class, "apply", constants$106.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$106.const$3
    );
}


