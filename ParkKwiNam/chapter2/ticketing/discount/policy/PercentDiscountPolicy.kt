package chapter2.ticketing.discount.policy

import chapter2.items.Money
import chapter2.ticketing.discount.condition.DiscountCondition

class PercentDiscountPolicy(private val percent: Int, discountCondition: List<DiscountCondition>) :
    ConditionDiscountPolicy(discountCondition) {
    override fun getDiscountMoney(fee: Money): Money {
        return Money(fee.value - (fee.value * (percent.toDouble() / 100)).toInt())
    }
}