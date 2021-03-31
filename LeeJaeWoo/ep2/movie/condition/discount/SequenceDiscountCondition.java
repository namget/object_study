package hw2.movie.condition.discount;

import hw2.movie.screen.Screening;

public class SequenceDiscountCondition implements DiscountCondition {

    private int seqence;

    public SequenceDiscountCondition(int seqence) {
        this.seqence = seqence;
    }

    @Override
    public boolean isSatisfied(Screening screening) {
        return screening.isSequence(seqence);
    }
}
