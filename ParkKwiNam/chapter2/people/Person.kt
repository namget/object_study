package chapter2.people

abstract class Person(private val name: String, val age: Int) {
    override fun toString(): String {
        return "$name($age)"
    }
}