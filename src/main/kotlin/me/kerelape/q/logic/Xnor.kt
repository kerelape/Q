package me.kerelape.q.logic

import me.kerelape.q.Condition

class Xnor(private val a: Condition, private val b: Condition) : Condition {

    override suspend fun value() = Not(Xor(this.a, this.b)).value()
}
