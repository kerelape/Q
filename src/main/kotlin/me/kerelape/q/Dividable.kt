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
