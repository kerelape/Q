package me.kerelape.q.logic

import me.kerelape.q.Condition

class Nand(private val a: Condition, private val b: Condition) : Condition {

    override suspend fun value() = Not(And(this.a, this.b)).value()
}
