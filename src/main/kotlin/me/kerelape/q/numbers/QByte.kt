package me.kerelape.q.numbers

import me.kerelape.q.Q

class QByte(private val origin: Q<Byte>) : Number<Byte> {

    override suspend fun value() = this.origin.value()

    override fun add(other: Number<Byte>) = QInt { this.value() + other.value() }.asByte()

    override fun subtract(other: Number<Byte>) = QInt { this.value() - other.value() }.asByte()

    override fun multiply(by: Number<Byte>) = QInt { this.value() * by.value() }.asByte()

    override fun divide(by: Number<Byte>) = QInt { this.value() / by.value() }.asByte()
}
