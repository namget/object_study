package chapter2.ticketing.discount.policy

import chapter2.items.Money
import chapter2.people.User
import chapter2.ticketing.discount.condition.DiscountCondition

abstract class ConditionDiscountPolicy(private val discountCondition: List<DiscountCondition>) : DiscountPolicy {

    abstract fun getDiscountMoney(fee: Money): Money

    override fun calculateDiscount(fee: Money, user: User): Money {
        for (condition in discountCondition) {
            if (condition.isSatisfy(user)) {
                return getDiscountMoney(fee)
            }
        }
        return fee
    }
}