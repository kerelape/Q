package me.kerelape.q.numbers

import me.kerelape.q.Q

class QLong(private val origin: Q<Long>) : Number<Long> {
    override suspend fun value() = this.origin.value()
}