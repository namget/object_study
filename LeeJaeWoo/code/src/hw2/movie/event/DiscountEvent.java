package hw2.movie.event;

public interface DiscountEvent<T> {
    public boolean isSatisfied(T t);
}
