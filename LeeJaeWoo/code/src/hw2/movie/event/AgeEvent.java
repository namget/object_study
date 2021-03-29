package hw2.movie.event;

import hw2.ticket.Reservation;
import hw2.user.User;

public class AgeEvent implements UserDiscountEvent {
    @Override
    public boolean isSatisfied(Reservation reservation) {
        return reservation.isAndUnderAge(70) && reservation.isAndUnderAge(10);
    }

    @Override
    public int getSatisfiedCount(Reservation reservation) {
        int count = 0;
        for (User user : reservation.getUsers()) {
            if (user.getAge() >= 70 || user.getAge() <= 10) count++;
        }
        return count;
    }
}
