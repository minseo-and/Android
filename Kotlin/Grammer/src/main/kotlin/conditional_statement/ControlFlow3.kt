package conditional_statement

fun main() {
    val eraOfRyu = 2.32
    val eraOfdeGrom = 2.43

    val era = if (eraOfRyu < eraOfdeGrom) {
        println("2019 Ryu beat deGrom.")
        eraOfRyu
    } else {
        println("2019 deGrom beat Ryu.")
        eraOfdeGrom
    }

    println("2019 The Highest ERA in MLB is $era")
}