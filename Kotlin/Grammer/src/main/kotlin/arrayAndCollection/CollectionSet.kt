package arrayAndCollection

fun main() {

    // 1. 셋 생성하고 값 추가하기
    val set = mutableSetOf<String>()
    set.add("JAN")
    set.add("FEB")
    set.add("MAR")

    // 2. 전체 데이터 출력하기
    println("Set 전체 출력 = $set")

    // 3. 특정 값 삭제하기
    set.remove("FEB")
    println("Set 전체 출력 = $set")
}