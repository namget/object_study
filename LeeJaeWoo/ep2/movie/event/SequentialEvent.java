package hw2.movie.event;

import hw2.movie.screen.Reservation;

public class SequentialEvent implements SequentialDiscountEvent {

    private int sequence;

    public SequentialEvent(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfied(Reservation reservation) {
        return reservation.getSequence() == sequence;
    }

    @Override
    public int getSatisfiedCount(Reservation reservation) {
        return reservation.getUsers().size();
    }
}
