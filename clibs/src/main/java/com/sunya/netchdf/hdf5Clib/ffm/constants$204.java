// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$204 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$204() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "H5Gclose_async",
        constants$34.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(H5G_iterate_t.class, "apply", constants$36.const$1);
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, JAVA_LONG).withName("fileno"),
        MemoryLayout.sequenceLayout(2, JAVA_LONG).withName("objno"),
        JAVA_INT.withName("nlink"),
        JAVA_INT.withName("type"),
        JAVA_LONG.withName("mtime"),
        JAVA_LONG.withName("linklen"),
        MemoryLayout.structLayout(
            JAVA_LONG.withName("size"),
            JAVA_LONG.withName("free"),
            JAVA_INT.withName("nmesgs"),
            JAVA_INT.withName("nchunks")
        ).withName("ohdr")
    ).withName("H5G_stat_t");
    static final VarHandle const$3 = constants$204.const$2.varHandle(MemoryLayout.PathElement.groupElement("nlink"));
    static final VarHandle const$4 = constants$204.const$2.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$5 = constants$204.const$2.varHandle(MemoryLayout.PathElement.groupElement("mtime"));
}


