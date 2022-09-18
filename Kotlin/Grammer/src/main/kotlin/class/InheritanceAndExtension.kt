package `class`

fun main() {
    textStringExtension()
}

fun textStringExtension() {
    var original = "Hello"
    var added = " Guys~"
    // plus 메서드를 사용하여 문자열을 더할 수 있다
    println("added를 더한 값은 ${original.plus(added)}입니다")
}

fun String.plus(word : String) : String {
    return this + word
}
