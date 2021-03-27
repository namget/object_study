package hw2.movie.policy;

import hw2.item.Money;
import hw2.movie.condition.discount.DiscountCondition;
import hw2.movie.screen.Screening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AmountDiscountPolicy implements DiscountPolicy{

    private final Money amount;

    private List<DiscountCondition> discountConditions = new ArrayList<>();

    public AmountDiscountPolicy(Money amount,DiscountCondition... discountConditions) {
        this.amount = amount;
        this.discountConditions = Arrays.asList(discountConditions);
    }

    public Money getCalculateDiscountAmount(Screening screening) {
        for (DiscountCondition discountCondition : discountConditions) {
            if (discountCondition.isSatisfied(screening)) {
                return calculateFee(screening);
            }
        }
        return Money.ZERO;
    }

    @Override
    public Money calculateFee(Screening screening) {
        return screening.getMovieFee().minusMoney(amount);
    }
}
