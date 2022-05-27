package me.kerelape.q.logic

object Falsity : Condition {

    override suspend fun value() = false
}
