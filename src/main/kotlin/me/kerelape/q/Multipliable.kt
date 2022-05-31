package me.kerelape.q

interface Multipliable<in O, out R> {

    /**
     * @return Q { this * [multiplicand] }
     */
    fun multiply(multiplicand: O): R
}

operator fun<O, R> Multipliable<O, R>.times(other: O) = this.multiply(other)
