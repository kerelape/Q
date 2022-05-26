package me.kerelape.q.memory

import me.kerelape.q.Q
import java.nio.ByteBuffer

class IntMemory(private val origin: Memory<ByteArray>) : Memory<Int> {

    override suspend fun value() = ByteBuffer.wrap(this.origin.value()).int

    override fun write(data: Q<Int>) = this.origin.write {
        ByteBuffer
            .allocate(Int.SIZE_BYTES)
            .putInt(data.value())
            .array()
    }
}
