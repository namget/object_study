package hw2.movie.policy;

import hw2.item.Money;
import hw2.movie.condition.discount.DiscountCondition;
import hw2.movie.screen.Screening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PercentDiscountPolicy implements DiscountPolicy {

    private final int percent;
    private List<DiscountCondition> discountConditions = new ArrayList<>();

    public PercentDiscountPolicy(int percent, DiscountCondition... discountConditions) {
        this.percent = percent;
        this.discountConditions = Arrays.asList(discountConditions);
    }

    @Override
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
        return screening.getMovieFee().percentDiscountMoney(this.percent);
    }
}
