package chapter2.sellable

import chapter2.ticketing.Ticketing

class TicketKiosk(private val name: String, override val ticketing: Ticketing) : TicketSellable {
    override fun toString(): String {
        return name
    }
}