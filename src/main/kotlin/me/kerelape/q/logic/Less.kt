package me.kerelape.q.logic

import me.kerelape.q.Condition
import me.kerelape.q.numbers.QNumber
import me.kerelape.q.numbers.asInt

class Less<T : Number>(private val a: QNumber<T>, private val b: QNumber<T>) : Condition {

    override suspend fun value() = this.a.subtract(this.b).value().asInt().value() < 0
}
