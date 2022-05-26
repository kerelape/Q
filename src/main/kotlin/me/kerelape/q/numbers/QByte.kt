package me.kerelape.q.numbers

import me.kerelape.q.Q

class QByte(private val origin: Q<Byte>) : QNumber<Byte> {

    override suspend fun value() = this.origin.value()

    override fun add(other: QNumber<Byte>) = QInt { this.value() + other.value() }.asByte()

    override fun subtract(other: QNumber<Byte>) = QInt { this.value() - other.value() }.asByte()

    override fun multiply(by: QNumber<Byte>) = QInt { this.value() * by.value() }.asByte()

    override fun divide(by: QNumber<Byte>) = QInt { this.value() / by.value() }.asByte()
}
