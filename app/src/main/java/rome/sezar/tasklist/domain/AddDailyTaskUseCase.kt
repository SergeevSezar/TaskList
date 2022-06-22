package rome.sezar.tasklist.domain

class AddDailyTaskUseCase(private val dailyTaskRepository: DailyTaskRepository) {

    fun addDailyTask(dailyTask: DailyTask) {
        dailyTaskRepository.addDailyTask(dailyTask)
    }
}