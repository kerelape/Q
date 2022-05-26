package me.kerelape.q.logic

import me.kerelape.q.Condition
import me.kerelape.q.numbers.QNumber

class Equality<T : Number>(private val a: QNumber<T>, private val b: QNumber<T>) : Condition {
    override suspend fun value() = this.a.subtract(this.b).value() == 0
}
