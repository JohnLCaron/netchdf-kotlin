// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$295 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$295() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
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
        RuntimeHelper.POINTER.withName("name"),
        JAVA_LONG.withName("mapl_id"),
        RuntimeHelper.POINTER.withName("map")
    ).withName("");
    static final VarHandle const$1 = constants$295.const$0.varHandle(MemoryLayout.PathElement.groupElement("name"));
    static final VarHandle const$2 = constants$295.const$0.varHandle(MemoryLayout.PathElement.groupElement("mapl_id"));
    static final VarHandle const$3 = constants$295.const$0.varHandle(MemoryLayout.PathElement.groupElement("map"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_LONG.withName("key_mem_type_id"),
        RuntimeHelper.POINTER.withName("key"),
        JAVA_LONG.withName("value_mem_type_id"),
        RuntimeHelper.POINTER.withName("value")
    ).withName("");
    static final VarHandle const$5 = constants$295.const$4.varHandle(MemoryLayout.PathElement.groupElement("key_mem_type_id"));
}


