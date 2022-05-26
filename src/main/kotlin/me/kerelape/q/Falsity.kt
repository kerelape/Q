package me.kerelape.q

object Falsity : Condition {
    override suspend fun value() = false
}