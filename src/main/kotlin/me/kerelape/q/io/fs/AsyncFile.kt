package me.kerelape.q.io.fs

import me.kerelape.q.Q
import java.nio.channels.AsynchronousFileChannel
import java.nio.file.OpenOption
import java.nio.file.Path

class AsyncFile(private val file: Q<Path>, private vararg val options: Q<OpenOption>) : Q<AsynchronousFileChannel> {
    override suspend fun value(): AsynchronousFileChannel {
        return AsynchronousFileChannel.open(
            this.file.value(),
            *this.options.map { it.value() }.toTypedArray()
        )
    }
}
