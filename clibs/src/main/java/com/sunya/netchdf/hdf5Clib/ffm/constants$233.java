// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$233 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$233() {}
    static final VarHandle const$0 = constants$232.const$4.varHandle(MemoryLayout.PathElement.groupElement("buf_size"));
    static final VarHandle const$1 = constants$232.const$4.varHandle(MemoryLayout.PathElement.groupElement("buf"));
    static final VarHandle const$2 = constants$232.const$4.varHandle(MemoryLayout.PathElement.groupElement("file_name_len"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("types"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("max_objs"),
        RuntimeHelper.POINTER.withName("oid_list"),
        RuntimeHelper.POINTER.withName("count")
    ).withName("H5VL_file_get_obj_ids_args_t");
    static final VarHandle const$4 = constants$233.const$3.varHandle(MemoryLayout.PathElement.groupElement("types"));
    static final VarHandle const$5 = constants$233.const$3.varHandle(MemoryLayout.PathElement.groupElement("max_objs"));
}


