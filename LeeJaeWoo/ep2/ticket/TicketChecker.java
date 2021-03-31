package hw2.ticket;

import hw2.item.Ticket;
import hw2.movie.screen.Reservation;
import hw2.movie.teather.BrandType;

public class TicketChecker {
    private BrandType brandType;

    public TicketChecker(BrandType brandType) {
        this.brandType = brandType;
    }

    public boolean checkTicket(Ticket ticket, Reservation reservation) {
        return ticket.getMovie().getName().equals(reservation.getName())
                && ticket.getSequence() == reservation.getSequence()
                && ticket.getBrandType() == brandType;
    }
}
