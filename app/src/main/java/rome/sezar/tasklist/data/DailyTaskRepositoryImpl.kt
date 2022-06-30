package rome.sezar.tasklist.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import rome.sezar.tasklist.domain.DailyTask
import rome.sezar.tasklist.domain.DailyTaskRepository

object DailyTaskRepositoryImpl: DailyTaskRepository {

    private val taskListLD = MutableLiveData<List<DailyTask>>()
    val taskList = mutableListOf<DailyTask>()
    private var autoIncrementId = 0

    override fun getDailyTask(id: Int): DailyTask {
       return taskList.find { it.id == id } ?: throw RuntimeException ("daily task undefined id = $id")
    }

    override fun getDailyTaskList(): LiveData<List<DailyTask>> {
        updateList()
        return taskListLD
    }

    override fun addDailyTask(dailyTask: DailyTask) {
        if (dailyTask.id == DailyTask.UNDEFINED_ID) {
            dailyTask.id = autoIncrementId++
        }
        taskList.add(dailyTask)
        updateList()
    }

    override fun removeDailyTask(dailyTask: DailyTask) {
        taskList.remove(dailyTask)
        updateList()
    }

    override fun checkDailyTask(dailyTask: DailyTask): Boolean {
        return dailyTask.isComplete
    }

    private fun updateList() {
        taskListLD.value = taskList.toList()
    }
}