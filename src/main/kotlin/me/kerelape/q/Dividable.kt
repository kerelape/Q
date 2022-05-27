package me.kerelape.q

interface Dividable<in O, out R> {

    /**
     * @return Q { this / [divisor] }
     */
    fun divide(divisor: O): Q<R>
}
