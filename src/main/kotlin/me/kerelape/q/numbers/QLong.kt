package me.kerelape.q.numbers

import me.kerelape.q.Q

class QLong(private val origin: Q<Long>) : QNumber<Long> {

    override suspend fun value() = this.origin.value()

    override fun add(other: QNumber<Long>) = QLong { this.value() + other.value() }

    override fun subtract(other: QNumber<Long>) = QLong { this.value() - other.value() }

    override fun multiply(by: QNumber<Long>) = QLong { this.value() * by.value() }

    override fun divide(by: QNumber<Long>) = QLong { this.value() / by.value() }
}
