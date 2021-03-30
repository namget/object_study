package chapter2.ticketing.sales

import chapter2.items.FREE
import chapter2.items.Money
import chapter2.items.Ticket
import chapter2.people.User

class TwoPlusOneSalesPolicy : SalesPolicy {
    override fun apply(price: Money, user: User): List<Ticket> {
        return (1..user.ticketCount).map { Ticket(price) } +
                (1..user.ticketCount / 2).map { Ticket(FREE) }
    }
}