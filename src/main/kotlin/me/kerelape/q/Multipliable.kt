package me.kerelape.q

interface Multipliable<in O, out R> {

    /**
     * @return Q { this * [multiplicand] }
     */
    fun multiply(multiplicand: O): R
}
