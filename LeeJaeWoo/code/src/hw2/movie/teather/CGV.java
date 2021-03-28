package hw2.movie.teather;

import hw2.movie.event.DiscountEvent;
import hw2.seller.AutomaticMarchine;
import hw2.seller.TicketOffice;
import hw2.seller.Seller;
import hw2.ticket.TicketChecker;
import hw2.seller.TicketSeller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CGV extends MovieBrand {

    public CGV() {
        initTicketSeller();
    }

    @Override
    BrandType getBrandType() {
        return BrandType.CGV;
    }

    private void initTicketSeller() {
        ticketSellers.add(new TicketSeller(ticketOffice));
        ticketSellers.add(new TicketSeller(ticketOffice));
        ticketSellers.add(new TicketSeller(ticketOffice));
        ticketSellers.add(new AutomaticMarchine(ticketOffice));
        ticketSellers.add(new AutomaticMarchine(ticketOffice));
    }

    @Override
    List<DiscountEvent> getDisCountEvent() {
        return Arrays.asList();
    }

    @Override
    public void showMovie() {
    }

}
