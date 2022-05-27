package me.kerelape.q.numbers

import me.kerelape.q.Q

class QByte(private val origin: Q<Byte>) : QNumber<Byte> {

    override suspend fun value() = this.origin.value()

    override fun add(addend: QNumber<Byte>) = Q { QInt { this.value() + addend.value() }.asByte() }

    override fun subtract(subtrahend: QNumber<Byte>) = Q { QInt { this.value() - subtrahend.value() }.asByte() }

    override fun multiply(multiplicand: QNumber<Byte>) = Q { QInt { this.value() * multiplicand.value() }.asByte() }

    override fun divide(divisor: QNumber<Byte>) = Q { QInt { this.value() / divisor.value() }.asByte() }

    override fun modulo(divisor: QNumber<Byte>) = Q { QInt { this.value() % divisor.value() }.asByte() }
}
