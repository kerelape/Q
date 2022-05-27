package me.kerelape.q.arithmetic

import me.kerelape.q.Q
import me.kerelape.q.Subtractable

class Difference<in O, out R>(private val minuend: Subtractable<O, R>, private val subtrahend: O) : Q<R> {

    override suspend fun value() = this.minuend.subtract(this.subtrahend).value()
}
