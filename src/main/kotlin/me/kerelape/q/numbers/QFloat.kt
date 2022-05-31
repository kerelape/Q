package me.kerelape.q.numbers

import me.kerelape.q.Q

class QFloat(private val origin: Q<Float>) : QNumber<Float>, Q<Float> by origin {

    override fun add(addend: Q<Float>) = QFloat { this.value() + addend.value() }

    override fun subtract(subtrahend: Q<Float>) = QFloat { this.value() - subtrahend.value() }

    override fun multiply(multiplicand: Q<Float>) = QFloat { this.value() * multiplicand.value() }

    override fun divide(divisor: Q<Float>) = QFloat { this.value() / divisor.value() }

    override fun modulo(divisor: Q<Float>) = QFloat { this.value() % divisor.value() }
}
