// Generated by jextract

package com.sunya.netchdf.hdf5Clib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*H5E_auto2_t)(long estack,void* client_data);
 * }
 */
public interface H5E_auto2_t {

    int apply(long prop_id, java.lang.foreign.MemorySegment close_data);
    static MemorySegment allocate(H5E_auto2_t fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$158.const$1, fi, constants$17.const$5, scope);
    }
    static H5E_auto2_t ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (long _prop_id, java.lang.foreign.MemorySegment _close_data) -> {
            try {
                return (int)constants$18.const$1.invokeExact(symbol, _prop_id, _close_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


