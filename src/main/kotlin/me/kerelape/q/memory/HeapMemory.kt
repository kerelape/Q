package me.kerelape.q.memory

import me.kerelape.q.Q
import me.kerelape.q.Task
import java.nio.ByteBuffer

class HeapMemory(private val value: ByteBuffer) : Memory<ByteArray> {

    override suspend fun value(): ByteArray = this.value.array()

    override fun write(data: Q<ByteArray>) = Task {
        this.value.put(data.value())
    }
}
