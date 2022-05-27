package me.kerelape.q.text

import me.kerelape.q.Summable

class SummableText(private val origin: Text) : Text, Summable<Text, Text> {

    override suspend fun value() = this.origin.value()

    override fun add(addend: Text) = Text { this.value() + addend.value() }
}
