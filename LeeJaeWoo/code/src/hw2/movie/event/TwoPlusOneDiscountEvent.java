package hw2.movie.event;

import hw2.ticket.Reservation;

public class TwoPlusOneDiscountEvent implements UserDiscountEvent {
    @Override
    public boolean isSatisfied(Reservation reservation) {
        return reservation.isAndAboveUserCount(2);
    }

    @Override
    public int getSatisfiedCount(Reservation reservation) {
        return (int) (reservation.getUsers().size() / 3);
    }
}
