package me.kerelape.q

class Safe<out T>(private val origin: Q<T>, private val fallback: Q<T>) : Q<T> {

    /**
     * @return [origin] or [fallback] if [origin] throws [QuantumException] (all other exceptions are ignored)
     */
    override suspend fun value() = (try { this.origin } catch (e: QuantumException) { this.fallback }).value()
}
