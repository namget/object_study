package chapter2.ticketing

import chapter2.movie.Movie

data class TicketingInfo(
    val movie: Movie = Movie(),
    val ticketCount: Int = 1
)