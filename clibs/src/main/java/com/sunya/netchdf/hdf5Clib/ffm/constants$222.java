// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$222 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$222() {}
    static final VarHandle const$0 = constants$221.const$5.varHandle(MemoryLayout.PathElement.groupElement("data_size"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_LONG.withName("type_id")
    ).withName("");
    static final VarHandle const$2 = constants$222.const$1.varHandle(MemoryLayout.PathElement.groupElement("type_id"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("idx_type"),
        JAVA_INT.withName("order"),
        RuntimeHelper.POINTER.withName("idx"),
        RuntimeHelper.POINTER.withName("op"),
        RuntimeHelper.POINTER.withName("op_data")
    ).withName("H5VL_attr_iterate_args_t");
    static final VarHandle const$4 = constants$222.const$3.varHandle(MemoryLayout.PathElement.groupElement("idx_type"));
    static final VarHandle const$5 = constants$222.const$3.varHandle(MemoryLayout.PathElement.groupElement("order"));
}


