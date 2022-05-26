package me.kerelape.q.numbers

import me.kerelape.q.Q

class QShort(private val origin: Q<Short>) : QNumber<Short> {

    override suspend fun value() = this.origin.value()

    override fun add(other: QNumber<Short>) = QInt { this.value() + other.value() }.asShort()

    override fun subtract(other: QNumber<Short>) = QInt { this.value() - other.value() }.asShort()

    override fun multiply(by: QNumber<Short>) = QInt { this.value() * by.value() }.asShort()

    override fun divide(by: QNumber<Short>) = QInt { this.value() / by.value() }.asShort()
}
