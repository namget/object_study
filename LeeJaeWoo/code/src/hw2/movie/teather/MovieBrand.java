package hw2.movie.teather;

import hw2.movie.event.DiscountEvent;
import hw2.movie.screen.Screening;
import hw2.seller.AutomaticMarchine;
import hw2.seller.TicketOffice;
import hw2.seller.Seller;
import hw2.seller.TicketSeller;
import hw2.ticket.TicketChecker;
import hw2.user.User;

import java.util.ArrayList;
import java.util.List;

public abstract class MovieBrand {

    protected TicketOffice ticketOffice = new TicketOffice(getBrandType(), getDisCountEvent());
    protected TicketChecker ticketChecker = new TicketChecker(getBrandType());
    protected List<Seller> ticketSellers = new ArrayList<>();


    public MovieBrand() {
        initTicketSeller();
    }

    abstract List<DiscountEvent> getDisCountEvent();

    abstract BrandType getBrandType();

    private void initTicketSeller() {
        ticketSellers.add(new TicketSeller(ticketOffice));
        ticketSellers.add(new TicketSeller(ticketOffice));
        ticketSellers.add(new TicketSeller(ticketOffice));
        ticketSellers.add(new AutomaticMarchine(ticketOffice));
        ticketSellers.add(new AutomaticMarchine(ticketOffice));
    }

    protected void sellTicket(List<User> users, Screening screening) {
        for (Seller ticketSeller : ticketSellers) {
            ticketSeller.sellTo(users, screening);
        }
    }

    protected void showMovie() {
    }

    protected void enter(List<User> users, Screening screening) {
        boolean isAvailable = false;
        for(User user : users){
            isAvailable = isAvailable && ticketChecker.checkTicket(user.getTicket(), screening);
        }
        if (isAvailable) {
            showMovie();
        } else {
            sellTicket(users, screening);
        }
    }
}
