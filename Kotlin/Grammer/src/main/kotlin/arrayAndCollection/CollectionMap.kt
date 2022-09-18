package arrayAndCollection

fun main() {

    // 1. 맵 생성하기
    val map = mutableMapOf<String, String>()

    // 2. 값 넣기
    map.put("키1", "값2")
    map.put("키2", "값2")
    map.put("키3", "값3")

    // 3. 값 사용하기
    val variable = map.get("키2")
    println("키2의 값은 ${variable}입니다")

    // 4. 값 수정하기
    map.put("키2", "두 번째 값 수정")
    println("키2의 값은 ${map.get("키2")}입니다")

    // 5. 값 삭제하기
    map.remove("키2")
    // 5.1 없는 값을 불러오면 null 값이 출력된다
    println("키2의 값은 ${map.get("키2")}입니다")
}