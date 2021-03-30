package chapter2.inspector

import chapter2.people.User

interface TicketCheckable {
    fun checkTo(user: User): Boolean
}