package hw2.movie.event;

public class SequentialEvent implements DiscountEvent {
    @Override
    public boolean isSatisfied() {
        return false;
    }
}
