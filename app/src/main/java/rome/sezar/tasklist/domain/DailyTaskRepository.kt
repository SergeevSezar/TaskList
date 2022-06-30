package rome.sezar.tasklist.domain

import androidx.lifecycle.LiveData

interface DailyTaskRepository {

    fun getDailyTask(id: Int): DailyTask

    fun getDailyTaskList(): LiveData<List<DailyTask>>

    fun addDailyTask(dailyTask: DailyTask)

    fun removeDailyTask(dailyTask: DailyTask)

    fun checkDailyTask(dailyTask: DailyTask): Boolean

}