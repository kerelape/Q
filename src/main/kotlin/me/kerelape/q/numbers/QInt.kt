package me.kerelape.q.numbers

import me.kerelape.q.Q

class QInt(private val origin: Q<Int>) : QNumber<Int> {

    override suspend fun value() = this.origin.value()

    override fun add(addend: QNumber<Int>) = QInt { this.value() + addend.value() }

    override fun subtract(subtrahend: QNumber<Int>) = QInt { this.value() - subtrahend.value() }

    override fun multiply(multiplicand: QNumber<Int>) = QInt { this.value() * multiplicand.value() }

    override fun divide(divisor: QNumber<Int>) = QInt { this.value() / divisor.value() }

    override fun modulo(divisor: QNumber<Int>) = QInt { this.value() % divisor.value() }
}
