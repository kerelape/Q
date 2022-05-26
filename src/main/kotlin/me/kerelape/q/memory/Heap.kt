package me.kerelape.q.memory

import me.kerelape.q.Task

class Heap(private var value: ByteArray?) : Memory<ByteArray> {

    override suspend fun value() = this.value ?: throw IllegalStateException("Heap has no value")

    override fun write(data: ByteArray) = Task {
        this.value = data
    }
}