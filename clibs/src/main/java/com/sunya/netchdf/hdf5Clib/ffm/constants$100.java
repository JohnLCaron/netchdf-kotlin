// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$100 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$100() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "H5Dopen1",
        constants$71.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "H5Dextend",
        constants$17.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "H5Dvlen_reclaim",
        constants$71.const$0
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("__count"),
        MemoryLayout.unionLayout(
            JAVA_INT.withName("__wch"),
            MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("__wchb")
        ).withName("__value")
    ).withName("");
    static final VarHandle const$4 = constants$100.const$3.varHandle(MemoryLayout.PathElement.groupElement("__count"));
    static final UnionLayout const$5 = MemoryLayout.unionLayout(
        JAVA_INT.withName("__wch"),
        MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("__wchb")
    ).withName("");
}


