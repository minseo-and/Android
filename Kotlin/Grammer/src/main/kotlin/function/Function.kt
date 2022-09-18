package function

fun main() {

    // 4. 반환값이 있는 함수 square 사용하기
    var squareResult = square(30)
    println("30의 제곱은 ${squareResult}입니다")

    // 5. 반환값이 없는 함수는 그냥 실행한다
    printSum(3, 5)

    // 6. 입력값이 없는 함수 사용하기
    val PI = getPi()
    println("지름이 10인 원의 둘레는 ${10 * PI}입니다")

    // 7. 기본값이 있는 함수 사용하기
    newFunction("Hello")

    // 8. 파라미터 이름을 직접 지정하기
    newFunction("Michael", weight = 67.5)

}

// 1. 반환값이 있는 함수
fun square(x : Int) : Int {
    return x * x // square 함수는 입력받은 값에 2를 곱해서 반환합니다.
}

// 2. 반환값이 없는 함수
fun printSum(x : Int, y : Int) {
    println("x + y = ${x+y}")
}

// 3. 입력값 없이 반환값만 있는 함수
fun getPi() : Double {
    return 3.14
}

// 7. 기본값을 갖는 함수
fun newFunction(name: String, age : Int = 29, weight : Double = 65.5) {
    println("name의 값은 ${name}입니다")
    println("age의 값은 ${age}입니다")
    println("weight의 값은 ${weight}입니다")
}