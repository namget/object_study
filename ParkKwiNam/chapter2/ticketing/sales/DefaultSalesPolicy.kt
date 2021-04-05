package chapter2.ticketing.sales

import chapter2.items.Money
import chapter2.items.Ticket
import chapter2.people.User

class DefaultSalesPolicy : SalesPolicy {
    override fun apply(price: Money, user: User): List<Ticket> {
        return (1..user.ticketingInfo.ticketCount).map { Ticket(price) }
    }
}