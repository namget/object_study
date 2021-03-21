package chapter1.sellable

import chapter1.items.Ticket
import chapter1.people.User

class TicketKiosk(private val name: String) : TicketSellable {
    override fun sellTo(user: User) {
        println("sell from $this to $user")
        user.buyTicket(getTicket())
    }

    override fun getTicket(): Ticket {
        return Ticket()
    }

    override fun toString(): String {
        return name
    }
}