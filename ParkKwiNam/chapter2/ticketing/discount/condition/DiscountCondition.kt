package chapter2.ticketing.discount.condition

import chapter2.people.User

interface DiscountCondition {
    fun isSatisfy(user: User): Boolean
}