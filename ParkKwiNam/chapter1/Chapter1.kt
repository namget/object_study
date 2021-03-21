package chapter1

import chapter1.inspector.TicketInspector
import chapter1.items.Bag
import chapter1.items.Invitation
import chapter1.items.Money
import chapter1.people.User
import chapter1.place.Theater
import chapter1.sellable.TicketKiosk
import chapter1.sellable.TicketSellable
import chapter1.sellable.TicketSeller

fun main(args: Array<String>) {
    val theater = Theater()
    val ticketInspector = TicketInspector("검표원1")
    val ticketSeller = listOf<TicketSellable>(TicketSeller("티켓판매원1"), TicketSeller("티켓판매원2"))
    val ticketKiosk = listOf(TicketKiosk("키오스크1"), TicketKiosk("키오스크2"), TicketKiosk("키오스크3"))
    val userList = listOf(
        User("관람객1", Bag(mutableListOf(Invitation(), Money(50000)))),
        User("관람객2", Bag(mutableListOf(Invitation(), Money(10000)))),
        User("관람객3", Bag(mutableListOf(Invitation(), Money(7000)))),
        User("관람객4", Bag(mutableListOf(Money(50000)))),
        User("관람객5", Bag(mutableListOf(Money(10000)))),
        User("관람객6", Bag(mutableListOf(Money(7000)))),
        User("관람객7", Bag(mutableListOf()))
    )

    theater.setTicketCheckable(ticketInspector)
    theater.setTicketSellableList(ticketKiosk + ticketSeller)
    theater.enter(userList)
}