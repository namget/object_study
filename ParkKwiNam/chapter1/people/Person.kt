package chapter1.people

abstract class Person(private val name: String) {
    override fun toString(): String {
        return name
    }
}