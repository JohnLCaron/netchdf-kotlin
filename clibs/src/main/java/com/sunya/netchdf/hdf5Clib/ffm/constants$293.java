// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$293 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$293() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "H5VLobject_optional_op",
        constants$292.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "H5VLrequest_optional_op",
        constants$17.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(H5M_iterate_t.class, "apply", constants$36.const$1);
    static final UnionLayout const$3 = MemoryLayout.unionLayout(
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
            RuntimeHelper.POINTER.withName("name"),
            JAVA_LONG.withName("lcpl_id"),
            JAVA_LONG.withName("key_type_id"),
            JAVA_LONG.withName("val_type_id"),
            JAVA_LONG.withName("mcpl_id"),
            JAVA_LONG.withName("mapl_id"),
            RuntimeHelper.POINTER.withName("map")
        ).withName("create"),
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
            RuntimeHelper.POINTER.withName("name"),
            JAVA_LONG.withName("mapl_id"),
            RuntimeHelper.POINTER.withName("map")
        ).withName("open"),
        MemoryLayout.structLayout(
            JAVA_LONG.withName("key_mem_type_id"),
            RuntimeHelper.POINTER.withName("key"),
            JAVA_LONG.withName("value_mem_type_id"),
            RuntimeHelper.POINTER.withName("value")
        ).withName("get_val"),
        MemoryLayout.structLayout(
            JAVA_LONG.withName("key_mem_type_id"),
            RuntimeHelper.POINTER.withName("key"),
            JAVA_BOOLEAN.withName("exists"),
            MemoryLayout.paddingLayout(7)
        ).withName("exists"),
        MemoryLayout.structLayout(
            JAVA_LONG.withName("key_mem_type_id"),
            RuntimeHelper.POINTER.withName("key"),
            JAVA_LONG.withName("value_mem_type_id"),
            RuntimeHelper.POINTER.withName("value")
        ).withName("put"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("get_type"),
            MemoryLayout.paddingLayout(4),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    JAVA_LONG.withName("mapl_id")
                ).withName("get_mapl"),
                MemoryLayout.structLayout(
                    JAVA_LONG.withName("mcpl_id")
                ).withName("get_mcpl"),
                MemoryLayout.structLayout(
                    JAVA_LONG.withName("type_id")
                ).withName("get_key_type"),
                MemoryLayout.structLayout(
                    JAVA_LONG.withName("type_id")
                ).withName("get_val_type"),
                MemoryLayout.structLayout(
                    JAVA_LONG.withName("count")
                ).withName("get_count")
            ).withName("args")
        ).withName("get"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("specific_type"),
            MemoryLayout.paddingLayout(4),
            MemoryLayout.unionLayout(
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
                    JAVA_LONG.withName("idx"),
                    JAVA_LONG.withName("key_mem_type_id"),
                    RuntimeHelper.POINTER.withName("op"),
                    RuntimeHelper.POINTER.withName("op_data")
                ).withName("iterate"),
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
                    JAVA_LONG.withName("key_mem_type_id"),
                    RuntimeHelper.POINTER.withName("key")
                ).withName("del")
            ).withName("args")
        ).withName("specific")
    ).withName("H5VL_map_args_t");
    static final StructLayout const$4 = MemoryLayout.structLayout(
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
        JAVA_LONG.withName("lcpl_id"),
        JAVA_LONG.withName("key_type_id"),
        JAVA_LONG.withName("val_type_id"),
        JAVA_LONG.withName("mcpl_id"),
        JAVA_LONG.withName("mapl_id"),
        RuntimeHelper.POINTER.withName("map")
    ).withName("");
    static final VarHandle const$5 = constants$293.const$4.varHandle(MemoryLayout.PathElement.groupElement("name"));
}


