package chapter2.ticketing

import chapter2.items.Money
import chapter2.people.User
import chapter2.ticketing.discount.policy.DiscountPolicy
import chapter2.ticketing.sales.DefaultSalesPolicy
import chapter2.ticketing.sales.SalesPolicy

class Ticketing(
    private val defaultTicketFee: Money = Money(10000),
    var discountPolicy: List<DiscountPolicy>,
    var salesPolicy: SalesPolicy = DefaultSalesPolicy()
) {

    fun doTicketing(user: User) {
        val discountFee = applyDiscount(user)
        val tickets = salesPolicy.apply(discountFee, user)
        user.exchangeTicket(tickets)
    }

    private fun applyDiscount(user: User): Money {
        return discountPolicy.map { discountPolicy -> discountPolicy.calculateDiscount(defaultTicketFee, user) }
            .minByOrNull { money: Money -> money.value } ?: defaultTicketFee
    }
}