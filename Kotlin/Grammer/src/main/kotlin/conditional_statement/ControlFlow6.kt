package conditional_statement

fun main() {
    val currentTime = 6
    when {
        currentTime == 5 -> {
            println("The current time is 5 o'clock")
        }
        currentTime > 5 -> {
            println("It's past 5 o'clock now")
        }
        else -> {
            println("The current time is before 5 o'clock")
        }
    }
}