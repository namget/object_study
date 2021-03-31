package chapter2.ticketing.sales

import chapter2.items.Money
import chapter2.items.Ticket
import chapter2.people.User

interface SalesPolicy {
    fun apply(price: Money, user: User): List<Ticket>
}