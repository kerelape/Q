package me.kerelape.q.logic

import me.kerelape.q.Condition

class Or(private val a: Condition, private val b: Condition) : Condition {
    override suspend fun value() = this.a.value() || this.b.value()
}