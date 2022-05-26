package me.kerelape.q.numbers

import me.kerelape.q.Q

class QDouble(private val origin: Q<Double>) : QNumber<Double> {

    override suspend fun value() = this.origin.value()

    override fun add(other: QNumber<Double>) = QDouble { this.value() + other.value() }

    override fun subtract(other: QNumber<Double>) = QDouble { this.value() - other.value() }

    override fun multiply(by: QNumber<Double>) = QDouble { this.value() * by.value() }

    override fun divide(by: QNumber<Double>) = QDouble { this.value() / by.value() }
}
