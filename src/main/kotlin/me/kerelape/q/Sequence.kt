package me.kerelape.q

class Sequence(private vararg val tasks: Task) : Task {

    override suspend fun value() {
        for (task in this.tasks) {
            task.value()
        }
    }
}
