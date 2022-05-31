package me.kerelape.q.text

import me.kerelape.q.Summable

class SummableText(private val origin: Text) : Text by origin, Summable<Text, Text> {

    override fun add(addend: Text) = Text { this.value() + addend.value() }
}
