// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$394 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$394() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "H5Tcompiler_conv",
        constants$58.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "H5TSmutex_acquire",
        constants$22.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "H5TSmutex_release",
        constants$15.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "H5TSmutex_get_attempt_count",
        constants$15.const$4
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("func"),
        RuntimeHelper.POINTER.withName("op_data")
    ).withName("H5Z_cb_t");
    static final VarHandle const$5 = constants$394.const$4.varHandle(MemoryLayout.PathElement.groupElement("func"));
}


