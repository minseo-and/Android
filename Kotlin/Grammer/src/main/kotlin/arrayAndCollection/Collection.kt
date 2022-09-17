package arrayAndCollection

fun main() {
    var mutableList = mutableListOf("MON", "TUE", "THU")

    mutableList.add("THU")

    println(mutableList.get(0))
    println(mutableList.get(1))

    var stringList = mutableListOf<String>()

    stringList.add("월")
    stringList.add("화")
    stringList.add("수")

    stringList.set(1, "요일 변경")

    println(stringList.get(1))
    stringList.removeAt(1)
    println(stringList.get(1))
    println(stringList.size)

}