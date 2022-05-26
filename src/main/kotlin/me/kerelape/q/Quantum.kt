package me.kerelape.q

interface Quantum<T> {
    suspend fun value(): T
}