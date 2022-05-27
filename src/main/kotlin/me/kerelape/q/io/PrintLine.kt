package me.kerelape.q.io

import me.kerelape.q.Q
import me.kerelape.q.Task
import java.io.PrintStream
import me.kerelape.q.Sequence

class PrintLine(private val output: Q<PrintStream>, private val message: Q<*>) : Task {
    constructor(message: Q<*>) : this(Stdout, message)
    
    override suspend fun value() {
        Sequence(
            Print(this.output, this.message),
            Print(this.output) { "\n" }
        ).value()
    }
}
