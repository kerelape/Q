package me.kerelape.q.numbers

import me.kerelape.q.Q

class QByte(private val origin: Q<Byte>) : QNumber<Byte> {

    override suspend fun value() = this.origin.value()

    override fun add(addend: Q<Byte>) = QInt { this.value() + addend.value() }.asByte()

    override fun subtract(subtrahend: Q<Byte>) = QInt { this.value() - subtrahend.value() }.asByte()

    override fun multiply(multiplicand: Q<Byte>) = QInt { this.value() * multiplicand.value() }.asByte()

    override fun divide(divisor: Q<Byte>) = QInt { this.value() / divisor.value() }.asByte()

    override fun modulo(divisor: Q<Byte>) = QInt { this.value() % divisor.value() }.asByte()
}
