package me.kerelape.q.arithmetic

import me.kerelape.q.Multipliable
import me.kerelape.q.Q

class Product<in O, out R>(private val multiplier: Multipliable<O, R>, private val multiplicand: O) : Q<R> {

    override suspend fun value() = this.multiplier.multiply(this.multiplicand).value()
}
