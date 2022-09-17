package conditional_statement

fun main() {
    val a = 1
    val b = 2
    val c = 3

    if (a < b) {
        println("1: a is smaller than b")
    }

    if (a < b) {
        println("1: a is smaller than c")
    }

    if (a < b) {
        println("2: a is smaller than b")
    } else if (a < c) {
        println("2: a is smaller than b")
    }
}