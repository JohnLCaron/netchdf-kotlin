// Generated by jextract

package com.sunya.netchdf.mfhdfClib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$18 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$18() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$17.const$4
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("read"),
        RuntimeHelper.POINTER.withName("write"),
        RuntimeHelper.POINTER.withName("seek"),
        RuntimeHelper.POINTER.withName("close")
    ).withName("_IO_cookie_io_functions_t");
    static final VarHandle const$2 = constants$18.const$1.varHandle(MemoryLayout.PathElement.groupElement("read"));
    static final VarHandle const$3 = constants$18.const$1.varHandle(MemoryLayout.PathElement.groupElement("write"));
    static final VarHandle const$4 = constants$18.const$1.varHandle(MemoryLayout.PathElement.groupElement("seek"));
    static final VarHandle const$5 = constants$18.const$1.varHandle(MemoryLayout.PathElement.groupElement("close"));
}


