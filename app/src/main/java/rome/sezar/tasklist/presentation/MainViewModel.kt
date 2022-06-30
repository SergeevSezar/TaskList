package rome.sezar.tasklist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import rome.sezar.tasklist.data.DailyTaskRepositoryImpl
import rome.sezar.tasklist.domain.AddDailyTaskUseCase
import rome.sezar.tasklist.domain.DailyTask
import rome.sezar.tasklist.domain.GetAllDailyTaskListUseCase
import rome.sezar.tasklist.domain.RemoveDailyTaskUseCase

class MainViewModel : ViewModel() {

    private val repository: DailyTaskRepositoryImpl = DailyTaskRepositoryImpl

    private val getAllDailyTaskListUseCase: GetAllDailyTaskListUseCase = GetAllDailyTaskListUseCase(repository)
    private val addDailyTaskUseCase: AddDailyTaskUseCase = AddDailyTaskUseCase(repository)
    private val removeDailyTaskUseCase: RemoveDailyTaskUseCase = RemoveDailyTaskUseCase(repository)

    val taskList = getAllDailyTaskListUseCase.getDailyTaskList()

    fun addDailyTask(dailyTask: DailyTask) {
        addDailyTaskUseCase.addDailyTask(dailyTask)
    }

    fun removeDailyTask(dailyTask: DailyTask) {
        removeDailyTaskUseCase.removeDailyTask(dailyTask)
    }
}