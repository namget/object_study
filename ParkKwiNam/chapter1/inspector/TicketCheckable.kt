package chapter1.inspector

import chapter1.people.User

interface TicketCheckable {
    fun checkTo(user: User): Boolean
}