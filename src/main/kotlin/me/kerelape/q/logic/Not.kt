package me.kerelape.q.logic

import me.kerelape.q.Condition

class Not(private val origin: Condition) : Condition {

    override suspend fun value() = !this.origin.value()
}
