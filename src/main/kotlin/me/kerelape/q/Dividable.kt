package me.kerelape.q

interface Dividable<in O, out R> {

    /**
     * @return Q { this / [divisor] }
     */
    fun divide(divisor: O): Q<R>

    /**
     * @return Q { this % [divisor] }
     */
    fun modulo(divisor: O): Q<R>
}
