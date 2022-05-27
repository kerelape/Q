package me.kerelape.q.logic

class Nor(private val a: Condition, private val b: Condition) : Condition {

    override suspend fun value() = Not(Or(this.a, this.b)).value()
}
