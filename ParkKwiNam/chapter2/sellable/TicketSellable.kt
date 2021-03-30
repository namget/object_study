package chapter2.sellable

import chapter2.people.User
import chapter2.ticketing.Ticketing

interface TicketSellable {
    val ticketing: Ticketing

    fun sellTo(user: User) {
        println("sell from $this to $user")
        ticketing.doTicketing(user)
    }
}