// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$5 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$5() {}
    static final VarHandle const$0 = constants$4.const$4.varHandle(MemoryLayout.PathElement.groupElement("__high"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("__prev"),
        RuntimeHelper.POINTER.withName("__next")
    ).withName("__pthread_internal_list");
    static final VarHandle const$2 = constants$5.const$1.varHandle(MemoryLayout.PathElement.groupElement("__prev"));
    static final VarHandle const$3 = constants$5.const$1.varHandle(MemoryLayout.PathElement.groupElement("__next"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("__next")
    ).withName("__pthread_internal_slist");
    static final VarHandle const$5 = constants$5.const$4.varHandle(MemoryLayout.PathElement.groupElement("__next"));
}


