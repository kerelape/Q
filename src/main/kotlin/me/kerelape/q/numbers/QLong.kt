package me.kerelape.q.numbers

import me.kerelape.q.Q

class QLong(private val origin: Q<Long>) : QNumber<Long> {

    override suspend fun value() = this.origin.value()

    override fun add(addend: QNumber<Long>) = Q { QLong { this.value() + addend.value() } }

    override fun subtract(subtrahend: QNumber<Long>) = Q { QLong { this.value() - subtrahend.value() } }

    override fun multiply(multiplicand: QNumber<Long>) = Q { QLong { this.value() * multiplicand.value() } }

    override fun divide(divisor: QNumber<Long>) = Q { QLong { this.value() / divisor.value() } }
    
    override fun modulo(divisor: QNumber<Long>) = Q { QLong { this.value() % divisor.value() } }
}
