// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$210 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$210() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "H5VLunregister_connector",
        constants$19.const$1
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "H5VLquery_optional",
        constants$210.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "H5VLobject_is_native",
        constants$17.const$5
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(12, JAVA_BYTE).withName("__data")
    ).withName("");
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(64, JAVA_BYTE).withName("__data"),
            JAVA_LONG.withName("align")
        ).withName("u")
    ).withName("");
}


