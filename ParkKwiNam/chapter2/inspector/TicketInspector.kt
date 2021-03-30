package chapter2.inspector

import chapter2.people.Person
import chapter2.people.User

class TicketInspector(name: String, age: Int) : Person(name, age), TicketCheckable {

    override fun checkTo(user: User): Boolean {
        println("check from $this to $user")
        return user.checkTicket()
    }
}