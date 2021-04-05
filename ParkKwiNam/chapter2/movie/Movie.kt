package chapter2.movie

import chapter2.items.Money

data class Movie(
    val name: String = "DefaultMovie",
    val sequence: Int = 0,
    val price: Money = Money(10000)
)