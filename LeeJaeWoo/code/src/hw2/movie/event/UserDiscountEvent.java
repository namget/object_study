package hw2.movie.event;

import hw2.user.User;

interface UserDiscountEvent<T extends User> extends DiscountEvent<T> {
    boolean isSatisfied(T t);
}
