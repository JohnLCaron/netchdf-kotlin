// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$439 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$439() {}
    static final VarHandle const$0 = constants$438.const$0.varHandle(MemoryLayout.PathElement.groupElement("force_write_open"));
    static final VarHandle const$1 = constants$438.const$0.varHandle(MemoryLayout.PathElement.groupElement("creation_flags"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "H5FD_onion_init",
        constants$159.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "H5Pget_fapl_onion",
        constants$17.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "H5Pset_fapl_onion",
        constants$17.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "H5FDonion_get_revision_count",
        constants$17.const$2
    );
}


