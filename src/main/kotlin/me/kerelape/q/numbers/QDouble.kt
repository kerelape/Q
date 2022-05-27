package me.kerelape.q.numbers

import me.kerelape.q.Q

class QDouble(private val origin: Q<Double>) : QNumber<Double> {

    override suspend fun value() = this.origin.value()

    override fun add(addend: Q<Double>) = QDouble { this.value() + addend.value() }

    override fun subtract(subtrahend: Q<Double>) = QDouble { this.value() - subtrahend.value() }

    override fun multiply(multiplicand: Q<Double>) = QDouble { this.value() * multiplicand.value() }

    override fun divide(divisor: Q<Double>) = QDouble { this.value() / divisor.value() }

    override fun modulo(divisor: Q<Double>) = QDouble { this.value() % divisor.value() }
}
