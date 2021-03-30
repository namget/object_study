package chapter2.ticketing.discount.policy

import chapter2.items.Money
import chapter2.people.User

interface DiscountPolicy {
    fun calculateDiscount(fee: Money, user: User): Money
}