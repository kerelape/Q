package me.kerelape.q.numbers

import me.kerelape.q.Q

class QShort(private val origin: Q<Short>) : QNumber<Short> {

    override suspend fun value() = this.origin.value()

    override fun add(addend: QNumber<Short>) = Q { QInt { this.value() + addend.value() }.asShort() }

    override fun subtract(subtrahend: QNumber<Short>) = Q { QInt { this.value() - subtrahend.value() }.asShort() }

    override fun multiply(multiplicand: QNumber<Short>) = Q { QInt { this.value() * multiplicand.value() }.asShort() }

    override fun divide(divisor: QNumber<Short>) = Q { QInt { this.value() / divisor.value() }.asShort() }
}
