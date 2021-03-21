package chapter1.items

class Ticket : Item {
    val fee = Money(10000)

    override fun toString(): String {
        return "Ticket($fee)"
    }
}