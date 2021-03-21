package chapter1.sellable

import chapter1.items.Ticket
import chapter1.people.Person
import chapter1.people.User

class TicketSeller(name: String) : Person(name), TicketSellable {
    override fun sellTo(user: User) {
        println("sell from $this to $user")
        user.buyTicket(getTicket())
    }

    override fun getTicket(): Ticket {
        return Ticket()
    }
}