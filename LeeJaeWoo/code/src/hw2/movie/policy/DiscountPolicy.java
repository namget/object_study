package hw2.movie.policy;

import hw2.item.Money;
import hw2.movie.screen.Screening;

public interface DiscountPolicy {
    public Money getCalculateDiscountAmount(Screening screening);
    public Money calculateFee(Screening screening);

}
