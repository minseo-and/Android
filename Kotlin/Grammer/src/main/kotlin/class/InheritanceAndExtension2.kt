package `class`

fun main() {
    // 1. 부모 클래스 직접 호출하기
    var parent = Parent()
    parent.sayHello()

    // 2. 자식 클래스 직접 호출하기
    var child = Child()
    child.myHello()

    textStringExtension()
}

fun testStringExtension() {
    var original = "Hello"
    var added = " Guys~"
    // plus 메서드를 사용해서 문자열을 더할 수 있다
}

open class Parent {
    var hello: String = "안녕하세요"
    fun sayHello() {
        println(hello)
    }
}

class Child : Parent() {
    fun myHello() {
        hello = "Hello"
        sayHello()
    }
}

// 메서드 오버라이드
open class BaseClass {
    open fun opened() {

    }

    fun notOpened() {

    }
}

class ChildClass : BaseClass() {
    override fun opened() {

    }
//        override fun notOpened() { // 오버라이드가 되지 않고 에러가 발생한다
//
//        }
}

// 프로퍼티 오버라이드 연습
open class BaseClass2 {
    open var opened: String = "I am"
}

class ChildClass2 : BaseClass2() {
    override var opened: String = "You are"
}


