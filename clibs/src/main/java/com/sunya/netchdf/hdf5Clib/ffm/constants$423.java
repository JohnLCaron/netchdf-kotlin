// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$423 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$423() {}
    static final VarHandle const$0 = constants$422.const$4.varHandle(MemoryLayout.PathElement.groupElement("buf"));
    static final VarHandle const$1 = constants$422.const$4.varHandle(MemoryLayout.PathElement.groupElement("image_len"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("sect_info"),
        JAVA_LONG.withName("nsects"),
        RuntimeHelper.POINTER.withName("sect_count")
    ).withName("H5VL_native_file_get_free_sections_t");
    static final VarHandle const$3 = constants$423.const$2.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$4 = constants$423.const$2.varHandle(MemoryLayout.PathElement.groupElement("sect_info"));
    static final VarHandle const$5 = constants$423.const$2.varHandle(MemoryLayout.PathElement.groupElement("nsects"));
}


