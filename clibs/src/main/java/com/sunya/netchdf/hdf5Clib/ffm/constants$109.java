// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$109 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$109() {}
    static final MemorySegment const$0 = RuntimeHelper.lookupGlobalVariable("stdout", RuntimeHelper.POINTER);
    static final MemorySegment const$1 = RuntimeHelper.lookupGlobalVariable("stderr", RuntimeHelper.POINTER);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "remove",
        constants$15.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "rename",
        constants$13.const$4
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "renameat",
        constants$109.const$4
    );
}


