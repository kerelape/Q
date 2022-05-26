package me.kerelape.q.text

import me.kerelape.q.Q
import me.kerelape.q.numbers.*

typealias Text = Q<String>

fun Text.toByte() = QByte { this.value().toByte() }

fun Text.toShort() = QShort { this.value().toShort() }

fun Text.toInt() = QInt { this.value().toInt() }

fun Text.toLong() = QLong { this.value().toLong() }

fun Text.toFloat() = QFloat { this.value().toFloat() }

fun Text.toDouble() = QDouble { this.value().toDouble() }

