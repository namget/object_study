package chapter2.sellable

import chapter2.people.Person
import chapter2.ticketing.Ticketing

class TicketSeller(name: String, age: Int, override val ticketing: Ticketing) : Person(name, age), TicketSellable {
}