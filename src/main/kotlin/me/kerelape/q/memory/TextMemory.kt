package me.kerelape.q.memory

import me.kerelape.q.Q
import java.nio.charset.Charset

class TextMemory(
    private val origin: Memory<ByteArray>,
    private val encoding: Q<Charset> = Q { Charsets.UTF_8 }
) : Memory<String> {

    override suspend fun value() = String(this.origin.value(), this.encoding.value())

    override fun write(data: Q<String>) = this.origin.write { data.value().toByteArray(this.encoding.value()) }
}