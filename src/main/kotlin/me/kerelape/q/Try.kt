package me.kerelape.q

class Try(
    private val main: Task,
    private val fallback: Fallback = Fallback { Task {  } },
    private val final: Task = Task {  }
) : Task {

    override suspend fun value() =
        try { this.main.value() }
        catch (e: Throwable) { this.fallback.catch(e).value() }
        finally { this.final.value() }

    fun interface Fallback {

        fun catch(e: Throwable): Task
    }
}
