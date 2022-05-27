package me.kerelape.q.numbers

import me.kerelape.q.Q

class QLong(private val origin: Q<Long>) : QNumber<Long> {

    override suspend fun value() = this.origin.value()

    override fun add(addend: Q<Long>) = QLong { this.value() + addend.value() }

    override fun subtract(subtrahend: Q<Long>) = QLong { this.value() - subtrahend.value() }

    override fun multiply(multiplicand: Q<Long>) = QLong { this.value() * multiplicand.value() }

    override fun divide(divisor: Q<Long>) = QLong { this.value() / divisor.value() }

    override fun modulo(divisor: Q<Long>) = QLong { this.value() % divisor.value() }
}
