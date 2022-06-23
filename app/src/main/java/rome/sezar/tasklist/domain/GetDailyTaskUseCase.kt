package rome.sezar.tasklist.domain

class GetDailyTaskUseCase(private val dailyTaskRepository: DailyTaskRepository) {

    fun getDailyTask(id: Int): DailyTask {
        return dailyTaskRepository.getDailyTask(id)
    }
}