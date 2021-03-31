package chapter2.items

class Bag(private var items: MutableList<Item>) : Item {

    fun exchangeTicket(ticket: Ticket): Boolean {
        if (hasItem(Invitation::class.java)) {
            putItem(ticket)
            return true
        } else {
            items.find { it is Money }?.let {
                val money = it as Money
                if (money.value >= ticket.fee.value) {
                    money.value -= ticket.fee.value
                    putItem(ticket)
                    return true
                }
            }
        }
        return false
    }

    fun hasItem(itemClass: Class<out Item>): Boolean {
        return items.filterIsInstance(itemClass).isNotEmpty()
    }

    fun <T> getItem(itemClass: Class<T>): T? {
        return items.filterIsInstance(itemClass).firstOrNull()
    }

    private fun putItem(item: Item) {
        items.add(item)
    }

    private fun removeItem(item: Item) {
        items.remove(item)
    }

    override fun toString(): String {
        return items.toString()
    }
}