package me.kerelape.q.text

import me.kerelape.q.Dividable
import me.kerelape.q.Q
import me.kerelape.q.numbers.QInt

class DividableText(private val origin: Text) : Text by origin, Dividable<Q<Int>, Text> {

    /**
     * Example:
     * ```
     * DividableText { "Hello, World!" }.divide { 2 } // Text { "Hello," }
     * ```
     * @return Q { [origin] divided by [divisor] }
     */
    override fun divide(divisor: Q<Int>) =
        Substring(
            this,
            QInt(Length(this)).divide(divisor)
        )

    /**
     * Example:
     * ```
     * DividableText { "Hello, World!" }.modulo { 2 } // Text { " World!" }
     * ```
     * @return Q { reminder of [origin] divided by [divisor] }
     */
    override fun modulo(divisor: Q<Int>) =
        Substring(
            this,
            QInt(Length(this)).divide(divisor),
            QInt(Length(this)).subtract { 1 }
        )
}
