package me.kerelape.q.numbers

import me.kerelape.q.Q

class QDouble(private val origin: Q<Double>) : Number<Double> {
    override suspend fun value() = this.origin.value()
}