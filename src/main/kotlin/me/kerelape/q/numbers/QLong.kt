package me.kerelape.q.numbers

import me.kerelape.q.Q

class QLong(private val origin: Q<Long>) : Number<Long> {

    override suspend fun value() = this.origin.value()

    override fun add(other: Number<Long>) = QLong { this.value() + other.value() }

    override fun subtract(other: Number<Long>) = QLong { this.value() - other.value() }

    override fun multiply(by: Number<Long>) = QLong { this.value() * by.value() }

    override fun divide(by: Number<Long>) = QLong { this.value() / by.value() }
}
