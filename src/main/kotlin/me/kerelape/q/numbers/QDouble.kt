package me.kerelape.q.numbers

import me.kerelape.q.Q

class QDouble(private val origin: Q<Double>) : Number<Double> {

    override suspend fun value() = this.origin.value()

    override fun add(other: Number<Double>) = QDouble { this.value() + other.value() }

    override fun subtract(other: Number<Double>) = QDouble { this.value() - other.value() }

    override fun multiply(by: Number<Double>) = QDouble { this.value() * by.value() }

    override fun divide(by: Number<Double>) = QDouble { this.value() / by.value() }
}
