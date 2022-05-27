package me.kerelape.q.numbers

import me.kerelape.q.Q
import me.kerelape.q.Dividable
import me.kerelape.q.Multipliable
import me.kerelape.q.Subtractable
import me.kerelape.q.Summable

interface QNumber<T : Number> :
    Q<T>,
    Summable<QNumber<T>, QNumber<T>>,
    Subtractable<QNumber<T>, QNumber<T>>,
    Multipliable<QNumber<T>, QNumber<T>>,
    Dividable<QNumber<T>, QNumber<T>>

fun QNumber<*>.asByte(): QNumber<Byte> = QByte { this.value().toByte() }

fun QNumber<*>.asShort(): QNumber<Short> = QShort { this.value().toShort() }

fun QNumber<*>.asInt(): QNumber<Int> = QInt { this.value().toInt() }

fun QNumber<*>.asLong(): QNumber<Long> = QLong { this.value().toLong() }

fun QNumber<*>.asFloat(): QNumber<Float> = QFloat { this.value().toFloat() }

fun QNumber<*>.asDouble(): QNumber<Double> = QDouble { this.value().toDouble() }
