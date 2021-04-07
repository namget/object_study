package chapter2

import chapter2.inspector.TicketInspector
import chapter2.items.Bag
import chapter2.items.Money
import chapter2.movie.Movie
import chapter2.people.User
import chapter2.place.Theater
import chapter2.sellable.TicketKiosk
import chapter2.sellable.TicketSellable
import chapter2.sellable.TicketSeller
import chapter2.ticketing.Ticketing
import chapter2.ticketing.TicketingInfo
import chapter2.ticketing.discount.condition.*
import chapter2.ticketing.discount.policy.AmountDiscountPolicy
import chapter2.ticketing.discount.policy.PercentDiscountPolicy
import chapter2.ticketing.sales.OnePlusOneSalesPolicy
import chapter2.ticketing.sales.TwoPlusOneSalesPolicy

fun main(args: Array<String>) {
    simulateCGV()
    simulateMegaBox()
    simulateLotteCinema()
}

fun getUserList() = listOf(
    User("관람객1", 10, Bag(mutableListOf(Money(9000))), TicketingInfo(Movie(name = "영화1", sequence = 1))),
    User("관람객2", 65, Bag(mutableListOf(Money(10000)))),
    User("관람객3", 75, Bag(mutableListOf(Money(8000)))),
    User("관람객4", 24, Bag(mutableListOf(Money(50000))), TicketingInfo(Movie(name = "영화2"), ticketCount = 4)),
)

val seniorDiscountPolicy = AmountDiscountPolicy(Money(2000), listOf(SeniorCondition()))
val youthAndSeniorDiscountPolicy = PercentDiscountPolicy(10, listOf(YouthCondition(), SeniorCondition()))
val morningDiscountPolicy = AmountDiscountPolicy(Money(3000), listOf(MovieSequenceDiscountCondition(sequence = 1)))

fun simulateCGV() {
    val cgv = Theater("CGV")
    val cgvTicketing =
        Ticketing(discountPolicy = listOf(seniorDiscountPolicy, youthAndSeniorDiscountPolicy, morningDiscountPolicy))
    val cgvTicketSeller = listOf<TicketSellable>(
        TicketSeller("cgv 티켓판매원1", 27, cgvTicketing),
        TicketSeller("cgv 티켓판매원2", 30, cgvTicketing)
    )
    val cgvTicketKiosk = listOf(
        TicketKiosk("cgv 키오스크1", cgvTicketing),
        TicketKiosk("cgv 키오스크2", cgvTicketing),
        TicketKiosk("cgv 키오스크3", cgvTicketing)
    )

    cgv.setTicketCheckable(TicketInspector("cgv 검표원", 24))
    cgv.setTicketSellableList(cgvTicketKiosk + cgvTicketSeller)
    cgv.enter(getUserList())
}

fun simulateMegaBox() {
    val megaBox = Theater("MegaBox")
    val enterOrderEventPolicy = PercentDiscountPolicy(100, listOf(EnterCountCondition(2)))
    val megaBoxTicketing = Ticketing(
        discountPolicy = listOf(seniorDiscountPolicy, enterOrderEventPolicy),
        salesPolicy = OnePlusOneSalesPolicy()
    )
    val megaBoxTicketKiosk = listOf(
        TicketKiosk("메가 키오스크1", megaBoxTicketing),
        TicketKiosk("메가 키오스크2", megaBoxTicketing),
    )
    megaBox.setTicketCheckable(TicketInspector("메가박스 검표원", 25))
    megaBox.setTicketSellableList(megaBoxTicketKiosk)
    megaBox.enter(getUserList())
}

fun simulateLotteCinema() {
    val lotteCinema = Theater("LotteCinema")
    val ageEventPolicy = PercentDiscountPolicy(100, listOf(AgeDiscountCondition { age -> age <= 10 || age >= 70 }))
    val lotteCinemaTicketing = Ticketing(
        discountPolicy = listOf(seniorDiscountPolicy, ageEventPolicy),
        salesPolicy = TwoPlusOneSalesPolicy()
    )
    val lotteCinemaTicketKiosk = listOf(
        TicketKiosk("롯데 키오스크1", lotteCinemaTicketing),
        TicketKiosk("롯데 키오스크2", lotteCinemaTicketing),
    )
    lotteCinema.setTicketCheckable(TicketInspector("롯데 검표원", 40))
    lotteCinema.setTicketSellableList(lotteCinemaTicketKiosk)
    lotteCinema.enter(getUserList())
}