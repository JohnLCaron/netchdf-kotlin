// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$270 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$270() {}
    static final VarHandle const$0 = constants$268.const$0.varHandle(MemoryLayout.PathElement.groupElement("close"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("create"),
        RuntimeHelper.POINTER.withName("open"),
        RuntimeHelper.POINTER.withName("get"),
        RuntimeHelper.POINTER.withName("specific"),
        RuntimeHelper.POINTER.withName("optional"),
        RuntimeHelper.POINTER.withName("close")
    ).withName("H5VL_file_class_t");
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG,
        JAVA_LONG,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(H5VL_file_class_t.create.class, "apply", constants$270.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$270.const$2
    );
    static final VarHandle const$5 = constants$270.const$1.varHandle(MemoryLayout.PathElement.groupElement("create"));
}


