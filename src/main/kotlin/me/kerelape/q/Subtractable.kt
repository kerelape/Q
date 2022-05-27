package me.kerelape.q

interface Subtractable<in O, out R> {

    /**
     * @return Q { this - [subtrahend] }
     */
    fun subtract(subtrahend: O): Q<R>
}
