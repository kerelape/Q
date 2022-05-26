package me.kerelape.q.numbers

import me.kerelape.q.Q

class QFloat(private val origin: Q<Float>) : Number<Float> {

    override suspend fun value() = this.origin.value()

    override fun add(other: Number<Float>) = QFloat { this.value() + other.value() }

    override fun subtract(other: Number<Float>) = QFloat { this.value() - other.value() }

    override fun multiply(by: Number<Float>) = QFloat { this.value() * by.value() }

    override fun divide(by: Number<Float>) = QFloat { this.value() / by.value() }
}
