package me.kerelape.q.arithmetic

import me.kerelape.q.Dividable
import me.kerelape.q.Q

class Reminder<in O, out R>(private val dividend: Dividable<O, Q<R>>, private val divisor: O) : Q<R> {

    override suspend fun value() = this.dividend.modulo(this.divisor).value()
}
