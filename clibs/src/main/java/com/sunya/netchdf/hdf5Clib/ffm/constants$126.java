// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$126 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$126() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "__uflow",
        constants$15.const$4
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "__overflow",
        constants$126.const$1
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_LONG.withName("cls_id"),
        JAVA_LONG.withName("maj_num"),
        JAVA_LONG.withName("min_num"),
        JAVA_INT.withName("line"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("func_name"),
        RuntimeHelper.POINTER.withName("file_name"),
        RuntimeHelper.POINTER.withName("desc")
    ).withName("H5E_error2_t");
    static final VarHandle const$4 = constants$126.const$3.varHandle(MemoryLayout.PathElement.groupElement("cls_id"));
    static final VarHandle const$5 = constants$126.const$3.varHandle(MemoryLayout.PathElement.groupElement("maj_num"));
}


