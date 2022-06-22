package rome.sezar.tasklist.domain

class RemoveDailyTaskUseCase(private val dailyTaskRepository: DailyTaskRepository) {

    fun removeDailyTask(dailyTask: DailyTask) {
        dailyTaskRepository.removeDailyTask(dailyTask)
    }
}