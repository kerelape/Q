package me.kerelape.q.logic

import me.kerelape.q.Condition

class Xor(private val a: Condition, private val b: Condition) : Condition {

    override suspend fun value() = Not { this.a.value() == this.b.value() }.value()
}
