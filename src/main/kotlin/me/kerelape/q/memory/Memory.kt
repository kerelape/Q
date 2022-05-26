package me.kerelape.q.memory

import me.kerelape.q.Q
import me.kerelape.q.Task

interface Memory<T> : Q<T> {

    /**
     * @return Task that write [data] to memory
     */
    fun write(data: T): Task
}