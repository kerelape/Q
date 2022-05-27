package me.kerelape.q.text

import me.kerelape.q.Dividable
import me.kerelape.q.arithmetic.Difference
import me.kerelape.q.arithmetic.Quotient
import me.kerelape.q.numbers.QInt
import me.kerelape.q.numbers.QNumber

class DividableText(private val origin: Text) : Text, Dividable<QNumber<Int>, Text> {

    override suspend fun value() = this.origin.value()

    /**
     * Example:
     * ```
     * DividableText { "Hello, World!" }.divide(QInt { 2 }).value() // Text { "Hello," }
     * ```
     * @return Q { [origin] divided by [divisor] }
     */
    override fun divide(divisor: QNumber<Int>) =
        Substring(
            this,
            Quotient(
                QInt(
                    Length(this)
                ),
                divisor
            )
        )

    /**
     * Example:
     * ```
     * DividableText { "Hello, World!" }.modulo(QInt { 2 }).value() // Text { " World!" }
     * ```
     * @return Q { reminder of [origin] divided by [divisor] }
     */
    override fun modulo(divisor: QNumber<Int>) =
        Substring(
            this,
            Quotient(
                QInt(
                    Length(this)
                ),
                divisor
            ),
            Difference(
                QInt(
                    Length(this),
                ),
                QInt { 1 }
            )
        )
}
