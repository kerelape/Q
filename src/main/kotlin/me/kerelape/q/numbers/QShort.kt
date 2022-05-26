package me.kerelape.q.numbers

import me.kerelape.q.Q

class QShort(private val origin: Q<Short>) : Number<Short> {

    override suspend fun value() = this.origin.value()

    override fun add(other: Number<Short>) = QInt { this.value() + other.value() }.asShort()

    override fun subtract(other: Number<Short>) = QInt { this.value() - other.value() }.asShort()

    override fun multiply(by: Number<Short>) = QInt { this.value() * by.value() }.asShort()

    override fun divide(by: Number<Short>) = QInt { this.value() / by.value() }.asShort()
}
