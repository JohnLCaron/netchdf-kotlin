// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$169 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$169() {}
    static final VarHandle const$0 = constants$167.const$3.varHandle(MemoryLayout.PathElement.groupElement("op_exec_time"));
    static final VarHandle const$1 = constants$167.const$3.varHandle(MemoryLayout.PathElement.groupElement("err_stack_id"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(H5ES_event_insert_func_t.class, "apply", constants$13.const$4);
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(H5ES_event_complete_func_t.class, "apply", constants$169.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$169.const$3
    );
}


