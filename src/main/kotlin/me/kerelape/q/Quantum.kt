package me.kerelape.q

fun interface Quantum<out T> {
    suspend fun value(): T
}
