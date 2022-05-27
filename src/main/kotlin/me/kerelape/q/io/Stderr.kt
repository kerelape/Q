package me.kerelape.q.io

import me.kerelape.q.Q
import java.io.PrintStream

object Stderr : Q<PrintStream> {

    override suspend fun value(): PrintStream = System.err
}
