package me.kerelape.q.numbers

import me.kerelape.q.Q

class QFloat(private val origin: Q<Float>) : QNumber<Float> {

    override suspend fun value() = this.origin.value()

    override fun add(addend: QNumber<Float>) = QFloat { this.value() + addend.value() }

    override fun subtract(subtrahend: QNumber<Float>) = QFloat { this.value() - subtrahend.value() }

    override fun multiply(multiplicand: QNumber<Float>) = QFloat { this.value() * multiplicand.value() }

    override fun divide(divisor: QNumber<Float>) = QFloat { this.value() / divisor.value() }

    override fun modulo(divisor: QNumber<Float>) = QFloat { this.value() % divisor.value() }
}
