package me.kerelape.q

/**
 * Thrown if a Quantum could not return its value
 */
open class QuantumException(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
