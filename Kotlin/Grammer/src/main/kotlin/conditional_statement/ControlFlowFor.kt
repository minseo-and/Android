package conditional_statement

fun main() {

    // 1. 일반적인 반복문 사용으로 열 번 반복하기
    for (index in 1..10) {
        println("현재 숫자는 $index")
    }
    // 2. 마지막 숫자 제외하기
    val array = arrayOf("JAN", "FEB", "MAR", "APR", "MAY", "JUN")
    for (index in array.indices) {
        println("현재 월은 ${array.get(index)}입니다")
    }
    // 3. 건너뛰기
    for (index in 0..10 step 3) {
        println("건너뛰기 : $index")
    }
    // 4. 감소시키기
    for (index in 10 downTo 0) {
        println("감소시키기 : $index")
    }
    // 4.1 건너뛰면서 감소하기
    for (index in 10 downTo 0 step 3) {
        println("건너뛰면서 감소시키기 : $index")
    }
    // 5.1 배열, 컬렉션 사용하기
    for (month in array) {
        println("현재 월은 ${month}입니다")
    }
}