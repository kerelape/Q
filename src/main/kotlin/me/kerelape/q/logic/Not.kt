package me.kerelape.q.logic

class Not(private val origin: Condition) : Condition {

    override suspend fun value() = !this.origin.value()
}
