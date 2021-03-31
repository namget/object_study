package hw2.movie.teather;

import hw2.movie.Movie;
import hw2.movie.event.DiscountEvent;
import hw2.movie.screen.Screening;
import hw2.seller.AutomaticMarchine;
import hw2.seller.TicketOffice;
import hw2.seller.Seller;
import hw2.seller.TicketSeller;
import hw2.movie.screen.Reservation;
import hw2.ticket.TicketChecker;
import hw2.user.User;

import java.util.ArrayList;
import java.util.List;

public abstract class MovieBrand {

    protected TicketChecker ticketChecker = new TicketChecker(getBrandType());
    protected List<Seller> ticketSellers = new ArrayList<>();
    protected DiscountEvent discountEvent;
    protected List<Screening> screenings;
    protected TicketOffice ticketOffice = new TicketOffice(getBrandType(), getDisCountEvent(), screenings);


    public MovieBrand(DiscountEvent discountEvent, List<Screening> screenings) {
        this.discountEvent = discountEvent;
        this.screenings = screenings;
        initTicketSeller();
    }

    protected DiscountEvent getDisCountEvent() {
        return discountEvent;
    }

    protected void changeDiscountEvent(DiscountEvent discountEvent) {
        this.discountEvent = discountEvent;
    }

    abstract BrandType getBrandType();

    private void initTicketSeller() {
        ticketSellers.add(new TicketSeller(ticketOffice));
        ticketSellers.add(new TicketSeller(ticketOffice));
        ticketSellers.add(new TicketSeller(ticketOffice));
        ticketSellers.add(new AutomaticMarchine(ticketOffice));
        ticketSellers.add(new AutomaticMarchine(ticketOffice));
    }

    protected void sellTicket(List<User> users, Reservation reservation) {

        for (Seller ticketSeller : ticketSellers) {
            ticketSeller.sellTo(reservation);
        }
    }

    protected void showMovie() {
    }

    protected void enter(List<User> users, Reservation reservation) {
        boolean isAvailable = false;
        for (User user : users) {
            isAvailable = isAvailable && ticketChecker.checkTicket(user.getTicket(), reservation);
        }
        if (isAvailable) {
            showMovie();
        } else {
            sellTicket(users, reservation);
        }
    }
}
