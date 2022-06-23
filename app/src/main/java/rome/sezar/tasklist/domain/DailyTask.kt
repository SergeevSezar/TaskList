package rome.sezar.tasklist.domain

data class DailyTask(
    val name: String,
    val isComplete: Boolean,
    val startTime: Float,
    var id: Int = UNDEFINED_ID
) {

    companion object {
        const val UNDEFINED_ID = -1
    }
}


