package rome.sezar.tasklist.domain

class CheckCompleteDailyTaskUseCase(private val dailyTaskRepository: DailyTaskRepository) {

    fun checkDailyTask(isComplete: Boolean) {
        dailyTaskRepository.checkDailyTask(isComplete)
    }
}