package me.kerelape.q.logic

class And(private val a: Condition, private val b: Condition) : Condition {

    override suspend fun value() = this.a.value() && this.b.value()
}
