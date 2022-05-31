package me.kerelape.q

interface Dividable<in O, out R> {

    /**
     * @return Q { this / [divisor] }
     */
    fun divide(divisor: O): R

    /**
     * @return Q { this % [divisor] }
     */
    fun modulo(divisor: O): R
}

operator fun<O, R> Dividable<O, R>.div(other: O) = this.divide(other)

operator fun<O, R> Dividable<O, R>.rem(other: O) = this.modulo(other)
