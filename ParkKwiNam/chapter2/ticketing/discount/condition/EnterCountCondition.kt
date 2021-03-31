package chapter2.ticketing.discount.condition

import chapter2.people.User

class EnterCountCondition(private val count: Int) : DiscountCondition {
    override fun isSatisfy(user: User): Boolean {
        return user.enterOrder == count
    }
}