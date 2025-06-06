// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$421 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$421() {}
    static final VarHandle const$0 = constants$420.const$3.varHandle(MemoryLayout.PathElement.groupElement("addr"));
    static final VarHandle const$1 = constants$420.const$3.varHandle(MemoryLayout.PathElement.groupElement("size"));
    static final UnionLayout const$2 = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("idx_type")
        ).withName("get_chunk_idx_type"),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("offset"),
            RuntimeHelper.POINTER.withName("size")
        ).withName("get_chunk_storage_size"),
        MemoryLayout.structLayout(
            JAVA_LONG.withName("space_id"),
            RuntimeHelper.POINTER.withName("nchunks")
        ).withName("get_num_chunks"),
        MemoryLayout.structLayout(
            JAVA_LONG.withName("space_id"),
            JAVA_LONG.withName("chk_index"),
            RuntimeHelper.POINTER.withName("offset"),
            RuntimeHelper.POINTER.withName("filter_mask"),
            RuntimeHelper.POINTER.withName("addr"),
            RuntimeHelper.POINTER.withName("size")
        ).withName("get_chunk_info_by_idx"),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("offset"),
            RuntimeHelper.POINTER.withName("filter_mask"),
            RuntimeHelper.POINTER.withName("addr"),
            RuntimeHelper.POINTER.withName("size")
        ).withName("get_chunk_info_by_coord"),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("offset"),
            JAVA_INT.withName("filters"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("buf")
        ).withName("chunk_read"),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("offset"),
            JAVA_INT.withName("filters"),
            JAVA_INT.withName("size"),
            RuntimeHelper.POINTER.withName("buf")
        ).withName("chunk_write"),
        MemoryLayout.structLayout(
            JAVA_LONG.withName("type_id"),
            JAVA_LONG.withName("space_id"),
            RuntimeHelper.POINTER.withName("size")
        ).withName("get_vlen_buf_size"),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("offset")
        ).withName("get_offset"),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("op"),
            RuntimeHelper.POINTER.withName("op_data")
        ).withName("chunk_iter")
    ).withName("H5VL_native_dataset_optional_args_t");
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("idx_type")
    ).withName("");
    static final VarHandle const$4 = constants$421.const$3.varHandle(MemoryLayout.PathElement.groupElement("idx_type"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("offset")
    ).withName("");
}


