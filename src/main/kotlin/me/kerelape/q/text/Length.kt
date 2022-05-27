package me.kerelape.q.text

import me.kerelape.q.Q

class Length(private val origin: Text) : Q<Int> {

    override suspend fun value() = this.origin.value().length
}
