package rome.sezar.tasklist.domain

class CheckCompleteDailyTaskUseCase(private val dailyTaskRepository: DailyTaskRepository) {

    fun checkDailyTask(dailyTask: DailyTask): Boolean {
        return dailyTaskRepository.checkDailyTask(dailyTask)
    }
}