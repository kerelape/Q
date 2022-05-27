package me.kerelape.q

interface Summable<in O, out R> {

    /**
     * @return Q { this + [addend] }
     */
    fun add(addend: O): Q<R>
}
