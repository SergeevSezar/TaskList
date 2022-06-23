package rome.sezar.tasklist.data

import rome.sezar.tasklist.domain.DailyTask
import rome.sezar.tasklist.domain.DailyTaskRepository

object DailyTaskRepositoryImpl: DailyTaskRepository {
    val taskList = mutableListOf<DailyTask>()
    var autoIncrementId = 0

    override fun getDailyTask(id: Int): DailyTask {
       return taskList.find { it.id == id } ?: throw RuntimeException ("daily task undefined id = $id")
    }

    override fun getDailyTaskList(): List<DailyTask> {
        return taskList.toList()
    }

    override fun addDailyTask(dailyTask: DailyTask) {
        if (dailyTask.id == DailyTask.UNDEFINED_ID) {
            dailyTask.id = autoIncrementId++
        }
        taskList.add(dailyTask)
    }

    override fun removeDailyTask(dailyTask: DailyTask) {
        taskList.remove(dailyTask)
    }

    override fun checkDailyTask(dailyTask: DailyTask): Boolean {
        return dailyTask.isComplete
    }
}