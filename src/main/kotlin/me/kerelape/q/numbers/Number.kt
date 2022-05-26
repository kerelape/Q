package me.kerelape.q.numbers

import me.kerelape.q.Q

interface Number<T : kotlin.Number> : Q<T> {

    /**
     * @return Sum of this and [other]
     */
    fun add(other: Number<T>): Number<T>

    /**
     * @return Difference between this and [other]
     */
    fun subtract(other: Number<T>): Number<T>

    /**
     * @return Product of this and [by] (multiplier)
     */
    fun multiply(by: Number<T>): Number<T>

    /**
     * @return Quotient of this and [by] (divisor)
     */
    fun divide(by: Number<T>): Number<T>
}

fun Number<*>.asByte(): Number<Byte> = QByte { this.value().toByte() }

fun Number<*>.asShort(): Number<Short> = QShort { this.value().toShort() }

fun Number<*>.asInt(): Number<Int> = QInt { this.value().toInt() }

fun Number<*>.asLong(): Number<Long> = QLong { this.value().toLong() }

fun Number<*>.asFloat(): Number<Float> = QFloat { this.value().toFloat() }

fun Number<*>.asDouble(): Number<Double> = QDouble { this.value().toDouble() }
