package me.kerelape.q.text

import me.kerelape.q.Q
import me.kerelape.q.numbers.QInt
import me.kerelape.q.numbers.QNumber

class Substring(
    private val origin: Text,
    private val offset: Q<Int>,
    private val length: Q<Int>
) : Text {
    constructor(origin: Text, length: QNumber<Int>) : this(origin, QInt { 0 }, length)

    override suspend fun value(): String {
        return this.origin.value().substring(this.offset.value()..this.length.value())
    }
}