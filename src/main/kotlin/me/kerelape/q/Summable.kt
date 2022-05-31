package me.kerelape.q

interface Summable<in O, out R> {

    /**
     * @return Q { this + [addend] }
     */
    fun add(addend: O): R
}

operator fun<O, R> Summable<O, R>.plus(other: O) = this.add(other)
