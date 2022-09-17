package conditional_statement

fun main() {
    var now = 9
    when (now) {
        8 ,9 -> {
            println("The current time is 8 or 9 o'clock")
        }
        else -> {
            println("The current time isn't 9 o'clock")
        }
    }
}