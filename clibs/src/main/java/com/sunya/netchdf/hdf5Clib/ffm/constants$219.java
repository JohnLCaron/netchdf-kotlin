// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$219 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$219() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("op_type"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("args")
    ).withName("H5VL_optional_args_t");
    static final VarHandle const$1 = constants$219.const$0.varHandle(MemoryLayout.PathElement.groupElement("op_type"));
    static final VarHandle const$2 = constants$219.const$0.varHandle(MemoryLayout.PathElement.groupElement("args"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("obj_type"),
            JAVA_INT.withName("type"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    RuntimeHelper.POINTER.withName("token")
                ).withName("loc_by_token"),
                MemoryLayout.structLayout(
                    RuntimeHelper.POINTER.withName("name"),
                    JAVA_LONG.withName("lapl_id")
                ).withName("loc_by_name"),
                MemoryLayout.structLayout(
                    RuntimeHelper.POINTER.withName("name"),
                    JAVA_INT.withName("idx_type"),
                    JAVA_INT.withName("order"),
                    JAVA_LONG.withName("n"),
                    JAVA_LONG.withName("lapl_id")
                ).withName("loc_by_idx")
            ).withName("loc_data")
        ).withName("loc_params"),
        JAVA_LONG.withName("buf_size"),
        RuntimeHelper.POINTER.withName("buf"),
        RuntimeHelper.POINTER.withName("attr_name_len")
    ).withName("H5VL_attr_get_name_args_t");
    static final VarHandle const$4 = constants$219.const$3.varHandle(MemoryLayout.PathElement.groupElement("buf_size"));
    static final VarHandle const$5 = constants$219.const$3.varHandle(MemoryLayout.PathElement.groupElement("buf"));
}


