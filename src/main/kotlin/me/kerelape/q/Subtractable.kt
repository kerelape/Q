package me.kerelape.q

interface Subtractable<in O, out R> {

    /**
     * @return Q { this - [subtrahend] }
     */
    fun subtract(subtrahend: O): R
}

operator fun<O, R> Subtractable<O, R>.minus(other: O) = this.subtract(other)
