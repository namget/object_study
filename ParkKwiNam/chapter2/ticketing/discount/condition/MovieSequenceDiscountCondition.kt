package chapter2.ticketing.discount.condition

import chapter2.people.User

class MovieSequenceDiscountCondition(private val sequence: Int) : DiscountCondition {
    override fun isSatisfy(user: User): Boolean {
        return user.ticketingInfo.movie.sequence == sequence
    }
}