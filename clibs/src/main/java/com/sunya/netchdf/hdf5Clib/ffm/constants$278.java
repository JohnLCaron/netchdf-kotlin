// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$278 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$278() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(H5VL_link_class_t.optional.class, "apply", constants$263.const$1);
    static final VarHandle const$1 = constants$275.const$3.varHandle(MemoryLayout.PathElement.groupElement("optional"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("open"),
        RuntimeHelper.POINTER.withName("copy"),
        RuntimeHelper.POINTER.withName("get"),
        RuntimeHelper.POINTER.withName("specific"),
        RuntimeHelper.POINTER.withName("optional")
    ).withName("H5VL_object_class_t");
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(H5VL_object_class_t.open.class, "apply", constants$278.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$278.const$3
    );
}


