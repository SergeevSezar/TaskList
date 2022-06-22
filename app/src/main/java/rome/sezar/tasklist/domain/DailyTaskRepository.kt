package rome.sezar.tasklist.domain

interface DailyTaskRepository {

    fun getDailyTask(id: Int)

    fun getDailyTaskList(): List<DailyTask>

    fun addDailyTask(dailyTask: DailyTask)

    fun removeDailyTask(dailyTask: DailyTask)

    fun checkDailyTask(isComplete: Boolean)

}