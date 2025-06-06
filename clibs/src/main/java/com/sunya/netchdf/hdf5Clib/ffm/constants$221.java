// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$221 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$221() {}
    static final UnionLayout const$0 = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("acpl_id")
        ).withName("get_acpl"),
        MemoryLayout.structLayout(
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
            RuntimeHelper.POINTER.withName("attr_name"),
            RuntimeHelper.POINTER.withName("ainfo")
        ).withName("get_info"),
        MemoryLayout.structLayout(
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
        ).withName("get_name"),
        MemoryLayout.structLayout(
            JAVA_LONG.withName("space_id")
        ).withName("get_space"),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("data_size")
        ).withName("get_storage_size"),
        MemoryLayout.structLayout(
            JAVA_LONG.withName("type_id")
        ).withName("get_type")
    ).withName("");
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_LONG.withName("acpl_id")
    ).withName("");
    static final VarHandle const$2 = constants$221.const$1.varHandle(MemoryLayout.PathElement.groupElement("acpl_id"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_LONG.withName("space_id")
    ).withName("");
    static final VarHandle const$4 = constants$221.const$3.varHandle(MemoryLayout.PathElement.groupElement("space_id"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("data_size")
    ).withName("");
}


