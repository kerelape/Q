package me.kerelape.q.numbers

import me.kerelape.q.Q

class QInt(private val origin: Q<Int>) : Number<Int> {

    override suspend fun value() = this.origin.value()

    override fun add(other: Number<Int>) = QInt { this.value() + other.value() }

    override fun subtract(other: Number<Int>) = QInt { this.value() - other.value() }

    override fun multiply(by: Number<Int>) = QInt { this.value() * by.value() }

    override fun divide(by: Number<Int>) = QInt { this.value() / by.value() }
}
