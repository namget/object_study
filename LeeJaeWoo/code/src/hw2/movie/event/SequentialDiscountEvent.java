package hw2.movie.event;

public interface SequentialDiscountEvent<T extends Integer> extends DiscountEvent<T>{
    public boolean isSatisfied(T t);
}
