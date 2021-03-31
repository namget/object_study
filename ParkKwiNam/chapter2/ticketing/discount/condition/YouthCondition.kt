package chapter2.ticketing.discount.condition

class YouthCondition : AgeDiscountCondition(
    { age -> age < 20 }
)