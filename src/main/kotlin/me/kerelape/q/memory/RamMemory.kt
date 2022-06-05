package me.kerelape.q.memory

import me.kerelape.q.Q
import me.kerelape.q.Task

class RamMemory(private var value: ByteArray = byteArrayOf()) : Memory<ByteArray> {

    override suspend fun value() = this.value

    override fun write(data: Q<ByteArray>) = Task {
        this.value = data.value()
    }
}