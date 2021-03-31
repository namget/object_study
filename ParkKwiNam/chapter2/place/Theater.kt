package chapter2.place

import chapter2.inspector.TicketCheckable
import chapter2.people.User
import chapter2.sellable.TicketSellable

class Theater(private val name: String) {

    private lateinit var ticketCheckable: TicketCheckable
    private lateinit var ticketSellableList: List<TicketSellable>

    fun setTicketCheckable(ticketCheckable: TicketCheckable) {
        this.ticketCheckable = ticketCheckable
    }

    fun setTicketSellableList(ticketSellableList: List<TicketSellable>) {
        this.ticketSellableList = ticketSellableList
    }

    fun enter(users: List<User>) {
        println("--- $name 영화관 ---")
        users.forEachIndexed { index, user ->
            user.enterOrder = index + 1
            ticketSellableList[index % ticketSellableList.size].sellTo(user)
            val result = ticketCheckable.checkTo(user)
            println("[result] >> $result, $user")
        }
    }

    override fun toString(): String {
        return name + ticketCheckable + ticketSellableList
    }
}