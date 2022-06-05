package me.kerelape.q.memory

import me.kerelape.q.Q
import me.kerelape.q.Task
import java.nio.ByteBuffer
import java.nio.channels.AsynchronousFileChannel
import java.nio.channels.CompletionHandler
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

class FileMemory(private val file: Q<AsynchronousFileChannel>) : Memory<ByteArray> {

    override suspend fun value(): ByteArray {
        val file = this.file.value()
        return suspendCoroutine { cont ->
            val buffer = ByteBuffer.allocate(file.size().toInt())
            file.read(buffer, 0, Unit, object : CompletionHandler<Int, Unit> {
                override fun completed(result: Int, attachment: Unit?) {
                    cont.resume(buffer.array())
                }

                override fun failed(exc: Throwable, attachment: Unit?) {
                    cont.resumeWithException(exc)
                }
            })
        }
    }

    override fun write(data: Q<ByteArray>) = Task {
        val file = this.file.value()
        val buffer = ByteBuffer.wrap(data.value())
        suspendCoroutine { cont ->
            file.write(buffer, 0, Unit, object : CompletionHandler<Int, Any> {
                override fun completed(result: Int?, attachment: Any?) {
                    cont.resume(Unit)
                }

                override fun failed(exc: Throwable, attachment: Any?) {
                    cont.resumeWithException(exc)
                }
            })
        }
    }
}
