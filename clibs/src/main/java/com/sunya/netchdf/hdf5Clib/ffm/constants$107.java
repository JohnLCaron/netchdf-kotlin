// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$107 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$107() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(cookie_write_function_t.class, "apply", constants$106.const$3);
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(cookie_seek_function_t.class, "apply", constants$107.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$107.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(cookie_close_function_t.class, "apply", constants$15.const$4);
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("read"),
        RuntimeHelper.POINTER.withName("write"),
        RuntimeHelper.POINTER.withName("seek"),
        RuntimeHelper.POINTER.withName("close")
    ).withName("_IO_cookie_io_functions_t");
}


