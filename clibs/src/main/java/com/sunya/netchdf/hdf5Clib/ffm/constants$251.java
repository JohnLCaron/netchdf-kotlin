// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$251 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$251() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("idx_type"),
        JAVA_INT.withName("order"),
        JAVA_INT.withName("fields"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("op"),
        RuntimeHelper.POINTER.withName("op_data")
    ).withName("H5VL_object_visit_args_t");
    static final VarHandle const$1 = constants$251.const$0.varHandle(MemoryLayout.PathElement.groupElement("idx_type"));
    static final VarHandle const$2 = constants$251.const$0.varHandle(MemoryLayout.PathElement.groupElement("order"));
    static final VarHandle const$3 = constants$251.const$0.varHandle(MemoryLayout.PathElement.groupElement("fields"));
    static final VarHandle const$4 = constants$251.const$0.varHandle(MemoryLayout.PathElement.groupElement("op"));
    static final VarHandle const$5 = constants$251.const$0.varHandle(MemoryLayout.PathElement.groupElement("op_data"));
}


