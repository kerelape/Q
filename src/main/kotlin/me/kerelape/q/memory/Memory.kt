package me.kerelape.q.memory

import me.kerelape.q.Q
import me.kerelape.q.Task

interface Memory<T> : Q<T> {

    /**
     * @return Task that writes [data] to memory
     */
    fun write(data: Q<T>): Task
}