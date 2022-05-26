package me.kerelape.q.numbers

import me.kerelape.q.Q

interface QNumber<T : kotlin.Number> : Q<T> {

    /**
     * @return Sum of this and [other]
     */
    fun add(other: QNumber<T>): QNumber<T>

    /**
     * @return Difference between this and [other]
     */
    fun subtract(other: QNumber<T>): QNumber<T>

    /**
     * @return Product of this and [by] (multiplier)
     */
    fun multiply(by: QNumber<T>): QNumber<T>

    /**
     * @return Quotient of this and [by] (divisor)
     */
    fun divide(by: QNumber<T>): QNumber<T>
}

fun QNumber<*>.asByte(): QNumber<Byte> = QByte { this.value().toByte() }

fun QNumber<*>.asShort(): QNumber<Short> = QShort { this.value().toShort() }

fun QNumber<*>.asInt(): QNumber<Int> = QInt { this.value().toInt() }

fun QNumber<*>.asLong(): QNumber<Long> = QLong { this.value().toLong() }

fun QNumber<*>.asFloat(): QNumber<Float> = QFloat { this.value().toFloat() }

fun QNumber<*>.asDouble(): QNumber<Double> = QDouble { this.value().toDouble() }
