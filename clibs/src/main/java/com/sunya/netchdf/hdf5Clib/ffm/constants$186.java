// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$186 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$186() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(H5FD_file_image_callbacks_t.image_memcpy.class, "apply", constants$186.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$186.const$0
    );
    static final VarHandle const$3 = constants$185.const$1.varHandle(MemoryLayout.PathElement.groupElement("image_memcpy"));
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(H5FD_file_image_callbacks_t.image_realloc.class, "apply", constants$186.const$4);
}


