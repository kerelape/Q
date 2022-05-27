package me.kerelape.q.numbers

import me.kerelape.q.Q

class QShort(private val origin: Q<Short>) : QNumber<Short> {

    override suspend fun value() = this.origin.value()

    override fun add(addend: Q<Short>) = QInt { this.value() + addend.value() }.asShort()

    override fun subtract(subtrahend: Q<Short>) = QInt { this.value() - subtrahend.value() }.asShort()

    override fun multiply(multiplicand: Q<Short>) = QInt { this.value() * multiplicand.value() }.asShort()

    override fun divide(divisor: Q<Short>) = QInt { this.value() / divisor.value() }.asShort()

    override fun modulo(divisor: Q<Short>) = QInt { this.value() % divisor.value() }.asShort()
}
