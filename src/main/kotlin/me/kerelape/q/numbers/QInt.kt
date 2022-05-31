package me.kerelape.q.numbers

import me.kerelape.q.Q

class QInt(private val origin: Q<Int>) : QNumber<Int>, Q<Int> by origin {

    override fun add(addend: Q<Int>) = QInt { this.value() + addend.value() }

    override fun subtract(subtrahend: Q<Int>) = QInt { this.value() - subtrahend.value() }

    override fun multiply(multiplicand: Q<Int>) = QInt { this.value() * multiplicand.value() }

    override fun divide(divisor: Q<Int>) = QInt { this.value() / divisor.value() }

    override fun modulo(divisor: Q<Int>) = QInt { this.value() % divisor.value() }
}
