package chapter2.ticketing.discount.policy

import chapter2.items.Money
import chapter2.ticketing.discount.condition.DiscountCondition

class AmountDiscountPolicy(private val amount: Money, discountCondition: List<DiscountCondition>) :
    ConditionDiscountPolicy(discountCondition) {
    override fun getDiscountMoney(fee: Money): Money {
        return Money(fee.value - amount.value)
    }
}