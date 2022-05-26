package me.kerelape.q

object Truth : Condition {
    override suspend fun value() = true
}