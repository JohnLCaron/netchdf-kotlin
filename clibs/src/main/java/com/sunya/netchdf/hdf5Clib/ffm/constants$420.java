// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$420 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$420() {}
    static final VarHandle const$0 = constants$419.const$2.varHandle(MemoryLayout.PathElement.groupElement("filter_mask"));
    static final VarHandle const$1 = constants$419.const$2.varHandle(MemoryLayout.PathElement.groupElement("addr"));
    static final VarHandle const$2 = constants$419.const$2.varHandle(MemoryLayout.PathElement.groupElement("size"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("offset"),
        RuntimeHelper.POINTER.withName("filter_mask"),
        RuntimeHelper.POINTER.withName("addr"),
        RuntimeHelper.POINTER.withName("size")
    ).withName("H5VL_native_dataset_get_chunk_info_by_coord_t");
    static final VarHandle const$4 = constants$420.const$3.varHandle(MemoryLayout.PathElement.groupElement("offset"));
    static final VarHandle const$5 = constants$420.const$3.varHandle(MemoryLayout.PathElement.groupElement("filter_mask"));
}


