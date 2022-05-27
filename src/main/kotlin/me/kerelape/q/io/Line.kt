package me.kerelape.q.io

import me.kerelape.q.Q
import me.kerelape.q.text.Text
import java.io.InputStream
import java.util.Scanner

class Line(private val input: Q<InputStream>) : Text {

    override suspend fun value(): String = Scanner(this.input.value()).nextLine()
}
