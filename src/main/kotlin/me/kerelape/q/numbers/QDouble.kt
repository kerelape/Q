package me.kerelape.q.numbers

import me.kerelape.q.Q

class QDouble(private val origin: Q<Double>) : QNumber<Double> {

    override suspend fun value() = this.origin.value()

    override fun add(addend: QNumber<Double>) = Q { QDouble { this.value() + addend.value() } }

    override fun subtract(subtrahend: QNumber<Double>) = Q { QDouble { this.value() - subtrahend.value() } }

    override fun multiply(multiplicand: QNumber<Double>) = Q { QDouble { this.value() * multiplicand.value() } }

    override fun divide(divisor: QNumber<Double>) = Q { QDouble { this.value() / divisor.value() } }

    override fun modulo(divisor: QNumber<Double>) = Q { QDouble { this.value() % divisor.value() } }
}
