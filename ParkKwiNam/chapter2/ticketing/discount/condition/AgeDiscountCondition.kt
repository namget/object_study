package chapter2.ticketing.discount.condition

import chapter2.people.User

open class AgeDiscountCondition(private val condition: (age: Int) -> Boolean) : DiscountCondition {
    override fun isSatisfy(user: User): Boolean {
        return condition.invoke(user.age)
    }
}