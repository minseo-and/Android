package arrayAndCollection

fun main() {
    // 1. basic type Array
    var students = IntArray(10)
    var longArray = LongArray(10)
    var charArray = CharArray(10)
    var floatArray = FloatArray(10)
    var doubleArray = DoubleArray(10)

    var intArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // 2. String type Array
    var stringArray = Array(10, { item -> "" })

    var dayArray = arrayOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")

    // 3. input
    students[0] = 90
    students[1] = 91
    students[2] = 92
    students[3] = 93
    students[4] = 94
    students.set(5, 95)
    students.set(6, 96)
    students.set(7, 97)
    students.set(8, 98)
    students.set(9, 99)

    // 4. change
    intArray[6] = 137
    intArray.set(9, 200)

    // 5. use
    val seventhValue = intArray[6]
    println("The value of the 8th intArray is $seventhValue")
    val tenthValue = intArray.get(9)
    println("The value of the 10th intArray is $tenthValue")

}