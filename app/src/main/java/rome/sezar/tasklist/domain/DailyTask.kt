package rome.sezar.tasklist.domain

data class DailyTask(
    val id: Int,
    val name: String,
    val isComplete: Boolean,
    val startTime: Float
)
