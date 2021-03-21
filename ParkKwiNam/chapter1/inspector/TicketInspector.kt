package chapter1.inspector

import chapter1.people.Person
import chapter1.people.User

class TicketInspector(name: String) : Person(name), TicketCheckable {

    override fun checkTo(user: User): Boolean {
        println("check from $this to $user")
        return user.checkTicket()
    }

}