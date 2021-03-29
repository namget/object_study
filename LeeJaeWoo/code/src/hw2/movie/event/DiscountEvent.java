package hw2.movie.event;

import hw2.ticket.Reservation;

public interface DiscountEvent {
    public boolean isSatisfied(Reservation reservation);
    public int getSatisfiedCount(Reservation reservation);
}
