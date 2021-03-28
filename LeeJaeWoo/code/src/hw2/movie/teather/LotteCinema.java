package hw2.movie.teather;

import hw2.movie.event.AgeEvent;
import hw2.movie.event.DiscountEvent;
import hw2.movie.event.OnePlusOneEvent;
import hw2.seller.AutomaticMarchine;
import hw2.seller.TicketOffice;
import hw2.seller.Seller;
import hw2.seller.TicketSeller;
import hw2.ticket.TicketChecker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LotteCinema extends MovieBrand {

    public LotteCinema() {
        initTicketSeller();
    }

    @Override
    List<DiscountEvent> getDisCountEvent() {
        return Arrays.asList(new OnePlusOneEvent(), new AgeEvent());
    }

    @Override
    BrandType getBrandType() {
        return BrandType.LOTTE_CINEMA;
    }

    private void initTicketSeller() {
        ticketSellers.add(new TicketSeller(ticketOffice));
        ticketSellers.add(new TicketSeller(ticketOffice));
        ticketSellers.add(new TicketSeller(ticketOffice));
        ticketSellers.add(new AutomaticMarchine(ticketOffice));
        ticketSellers.add(new AutomaticMarchine(ticketOffice));
    }

}
