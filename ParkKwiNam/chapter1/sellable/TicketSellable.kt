package chapter1.sellable

import chapter1.items.Ticket
import chapter1.people.User

interface TicketSellable {
    fun sellTo(user: User)
    fun getTicket(): Ticket
}