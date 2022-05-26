package me.kerelape.q.numbers

import me.kerelape.q.Q

interface Number<out T : kotlin.Number> : Q<T>

fun Number<*>.asByte(): Number<Byte> = QByte { this.value().toByte() }

fun Number<*>.asShort(): Number<Short> = QShort { this.value().toShort() }

fun Number<*>.asInt(): Number<Int> = QInt { this.value().toInt() }

fun Number<*>.asLong(): Number<Long> = QLong { this.value().toLong() }

fun Number<*>.asFloat(): Number<Float> = QFloat { this.value().toFloat() }

fun Number<*>.asDouble(): Number<Double> = QDouble { this.value().toDouble() }