package me.kerelape.q.arithmetic

import me.kerelape.q.Q
import me.kerelape.q.Summable

class Sum<in O, out R>(private val augend: Summable<O, Q<R>>, private val addend: O) : Q<R> {

    override suspend fun value() = this.augend.add(this.addend).value()
}
