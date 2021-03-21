package chapter1.people

import chapter1.items.Bag
import chapter1.items.Ticket

class User(name: String, private val bag: Bag) : Person(name) {

    fun buyTicket(ticket: Ticket) {
        bag.exchangeTicket(ticket)
    }

    fun checkTicket(): Boolean {
        return bag.hasItem(Ticket::class.java)
    }

    override fun toString(): String {
        return super.toString() + bag
    }
}