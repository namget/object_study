package chapter2.ticketing.discount.condition

class SeniorCondition : AgeDiscountCondition(
    { age -> age >= 65 }
)