package me.kerelape.q.numbers

import me.kerelape.q.Q

class QByte(private val origin: Q<Byte>) : Number<Byte> {
    override suspend fun value() = this.origin.value()
}