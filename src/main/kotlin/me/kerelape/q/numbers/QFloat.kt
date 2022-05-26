package me.kerelape.q.numbers

import me.kerelape.q.Q

class QFloat(private val origin: Q<Float>) : Number<Float> {
    override suspend fun value() = this.origin.value()
}