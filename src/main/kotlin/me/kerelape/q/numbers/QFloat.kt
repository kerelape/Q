package me.kerelape.q.numbers

import me.kerelape.q.Q

class QFloat(private val origin: Q<Float>) : QNumber<Float> {

    override suspend fun value() = this.origin.value()

    override fun add(other: QNumber<Float>) = QFloat { this.value() + other.value() }

    override fun subtract(other: QNumber<Float>) = QFloat { this.value() - other.value() }

    override fun multiply(by: QNumber<Float>) = QFloat { this.value() * by.value() }

    override fun divide(by: QNumber<Float>) = QFloat { this.value() / by.value() }
}
