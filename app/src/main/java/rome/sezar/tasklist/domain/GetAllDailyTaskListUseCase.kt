package rome.sezar.tasklist.domain

import androidx.lifecycle.LiveData

class GetAllDailyTaskListUseCase(private val dailyTaskRepository: DailyTaskRepository) {

    fun getDailyTaskList(): LiveData<List<DailyTask>> {
        return dailyTaskRepository.getDailyTaskList()
    }
}