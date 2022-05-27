package me.kerelape.q.io

import me.kerelape.q.Q
import java.io.InputStream

object Stdin : Q<InputStream> {

    override suspend fun value(): InputStream = System.`in`
}
