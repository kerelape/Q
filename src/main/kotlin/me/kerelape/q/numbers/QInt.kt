package me.kerelape.q.numbers

import me.kerelape.q.Q

class QInt(private val origin: Q<Int>) : Number<Int> {
    override suspend fun value() = this.origin.value()
}