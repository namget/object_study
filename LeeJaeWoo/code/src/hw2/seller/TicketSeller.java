package hw2.seller;

import hw2.movie.event.DiscountEvent;
import hw2.movie.screen.Screening;
import hw2.user.User;

import java.util.List;

public class TicketSeller implements Seller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    @Override
    public void sellTo(List<User> users , Screening screening) {
        DiscountEvent discountEvent = ticketOffice.isDiscountEventSatisfied(users);
        for(User user : users){
            ticketOffice.plusMoney(user.buy(ticketOffice.getTicket(screening)));
        }
    }


}
