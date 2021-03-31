package chapter2.people

import chapter2.items.Bag
import chapter2.items.Money
import chapter2.items.Ticket

class User(name: String, age: Int, private val bag: Bag, val ticketCount: Int = 1) : Person(name, age) {

    var enterOrder: Int = 0

    private fun checkBalance(amount: Money): Boolean {
        val money: Money? = bag.getItem(Money::class.java)
        return money?.value ?: 0 >= amount.value
    }

    fun exchangeTicket(tickets: List<Ticket>): Boolean {
        val totalFee = Money(tickets.sumOf { ticket -> ticket.fee.value })
        if (checkBalance(totalFee)) {
            for (ticket in tickets) {
                bag.exchangeTicket(ticket)
            }
            return true
        }
        return false
    }

    fun checkTicket(): Boolean {
        return bag.hasItem(Ticket::class.java)
    }

    override fun toString(): String {
        return super.toString() + "[$enterOrder 번째 고객]" + ", 희망구매($ticketCount)" + ", 소지품$bag"
    }
}