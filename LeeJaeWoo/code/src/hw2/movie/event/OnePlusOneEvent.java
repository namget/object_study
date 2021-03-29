package hw2.movie.event;

import hw2.ticket.Reservation;

public class OnePlusOneEvent implements UserDiscountEvent {
    @Override
    public boolean isSatisfied(Reservation reservation) {
        return reservation.isAndAboveUserCount(1);
    }

    @Override
    public int getSatisfiedCount(Reservation reservation) {
        return (int) (reservation.getUsers().size() / 2);
    }
}