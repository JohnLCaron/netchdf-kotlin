// Generated by jextract

package com.sunya.netchdf.mfhdfClib.ffm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * long (*cookie_read_function_t)(void* __cookie,char* __buf,unsigned long __nbytes);
 * }
 */
public interface cookie_read_function_t {

    long apply(java.lang.foreign.MemorySegment __cookie, java.lang.foreign.MemorySegment __buf, long __nbytes);
    static MemorySegment allocate(cookie_read_function_t fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$16.const$4, fi, constants$16.const$3, scope);
    }
    static cookie_read_function_t ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment ___cookie, java.lang.foreign.MemorySegment ___buf, long ___nbytes) -> {
            try {
                return (long)constants$16.const$5.invokeExact(symbol, ___cookie, ___buf, ___nbytes);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


