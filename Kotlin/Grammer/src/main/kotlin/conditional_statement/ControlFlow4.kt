package conditional_statement

fun main() {
    var now = 10
    when (now) {
        8 -> {
            println("The current time is 8 o'clock")
        }
        9 -> {
            println("The current time is 9 o'clock")
        }
        else -> {
            println("The current time isn't 9 o'clock")
        }
    }
}