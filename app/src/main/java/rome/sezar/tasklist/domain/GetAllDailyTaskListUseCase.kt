package rome.sezar.tasklist.domain

class GetAllDailyTaskListUseCase(private val dailyTaskRepository: DailyTaskRepository) {

    fun getDailyTaskList(): List<DailyTask> {
        return dailyTaskRepository.getDailyTaskList()
    }
}