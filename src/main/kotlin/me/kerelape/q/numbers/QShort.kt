package me.kerelape.q.numbers

import me.kerelape.q.Q

class QShort(private val origin: Q<Short>) : Number<Short> {
    override suspend fun value() = this.origin.value()
}