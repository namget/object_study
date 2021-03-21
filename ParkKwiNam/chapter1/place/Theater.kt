package chapter1.place

import chapter1.inspector.TicketCheckable
import chapter1.people.User
import chapter1.sellable.TicketSellable

class Theater {

    private lateinit var ticketCheckable: TicketCheckable
    private lateinit var ticketSellableList: List<TicketSellable>

    fun setTicketCheckable(ticketCheckable: TicketCheckable) {
        this.ticketCheckable = ticketCheckable
    }

    fun setTicketSellableList(ticketSellableList: List<TicketSellable>) {
        this.ticketSellableList = ticketSellableList
    }

    fun enter(user: List<User>) {
        user.forEachIndexed { index, user ->
            ticketSellableList[index % ticketSellableList.size].sellTo(user)
            val result = ticketCheckable.checkTo(user)
            println("result : $result - user $user")
        }

    }
}