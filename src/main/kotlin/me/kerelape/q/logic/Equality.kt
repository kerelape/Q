package me.kerelape.q.logic

import me.kerelape.q.Condition
import me.kerelape.q.Q

class Equality<T : Comparable<T>>(private val a: Q<T>, private val b: Q<T>) : Condition {
    override suspend fun value() = this.a.value().compareTo(b.value()) == 0
}
