package me.kerelape.q.numbers

import me.kerelape.q.Q

class QInt(private val origin: Q<Int>) : QNumber<Int> {

    override suspend fun value() = this.origin.value()

    override fun add(other: QNumber<Int>) = QInt { this.value() + other.value() }

    override fun subtract(other: QNumber<Int>) = QInt { this.value() - other.value() }

    override fun multiply(by: QNumber<Int>) = QInt { this.value() * by.value() }

    override fun divide(by: QNumber<Int>) = QInt { this.value() / by.value() }
}
