package hw2.movie.condition.discount;

import hw2.movie.screen.Screening;

public interface DiscountCondition {
    public boolean isSatisfied(Screening screening);
}
