package chapter2.items

class Ticket(val fee: Money = Money(10000)) : Item {

    override fun toString(): String {
        return "Ticket($fee)"
    }
}