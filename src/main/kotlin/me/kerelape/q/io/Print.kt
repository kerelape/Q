package me.kerelape.q.io

import me.kerelape.q.Q
import me.kerelape.q.Task
import java.io.PrintStream

class Print(private val output: Q<PrintStream> = Stdout, private val message: Q<*>) : Task {

    override suspend fun value() {
        this.output.value().print(this.message.value())
    }
}
