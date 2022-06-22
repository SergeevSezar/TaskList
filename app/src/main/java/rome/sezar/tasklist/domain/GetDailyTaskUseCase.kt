package rome.sezar.tasklist.domain

class GetDailyTaskUseCase(private val dailyTaskRepository: DailyTaskRepository) {

    fun getDailyTask(id: Int) {
        dailyTaskRepository.getDailyTask(id)
    }
}