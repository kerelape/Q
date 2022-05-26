package me.kerelape.q.io

import me.kerelape.q.Q
import java.io.PrintStream

object Stdout : Q<PrintStream> {
    override suspend fun value(): PrintStream = System.out
}