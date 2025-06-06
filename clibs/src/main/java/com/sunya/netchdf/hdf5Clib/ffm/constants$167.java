// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$167 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$167() {}
    static final VarHandle const$0 = constants$165.const$5.varHandle(MemoryLayout.PathElement.groupElement("op_ins_ts"));
    static final VarHandle const$1 = constants$165.const$5.varHandle(MemoryLayout.PathElement.groupElement("op_exec_ts"));
    static final VarHandle const$2 = constants$165.const$5.varHandle(MemoryLayout.PathElement.groupElement("op_exec_time"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("api_name"),
        RuntimeHelper.POINTER.withName("api_args"),
        RuntimeHelper.POINTER.withName("app_file_name"),
        RuntimeHelper.POINTER.withName("app_func_name"),
        JAVA_INT.withName("app_line_num"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("op_ins_count"),
        JAVA_LONG.withName("op_ins_ts"),
        JAVA_LONG.withName("op_exec_ts"),
        JAVA_LONG.withName("op_exec_time"),
        JAVA_LONG.withName("err_stack_id")
    ).withName("H5ES_err_info_t");
    static final VarHandle const$4 = constants$167.const$3.varHandle(MemoryLayout.PathElement.groupElement("api_name"));
    static final VarHandle const$5 = constants$167.const$3.varHandle(MemoryLayout.PathElement.groupElement("api_args"));
}


