package hw2.ticket;

import hw2.item.Ticket;
import hw2.movie.screen.Screening;
import hw2.movie.teather.BrandType;

public class TicketChecker {
    private BrandType brandType;

    public TicketChecker(BrandType brandType) {
        this.brandType = brandType;
    }

    public boolean checkTicket(Ticket ticket, Screening screening) {
        return ticket.getScreening().compareScreen(screening) && ticket.getBrandType() == brandType;
    }
}
