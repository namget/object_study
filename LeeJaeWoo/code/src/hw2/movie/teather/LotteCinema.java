package hw2.movie.teather;

import hw2.seller.AutomaticMarchine;
import hw2.seller.MoneyOffice;
import hw2.seller.Seller;
import hw2.seller.TicketSeller;
import hw2.ticket.TicketChecker;
import hw2.user.User;

import java.util.ArrayList;
import java.util.List;

public class LotteCinema implements TeatherBrand {
    private MoneyOffice moneyOffice = new MoneyOffice();
    private TicketChecker ticketChecker = new TicketChecker();
    List<Seller> ticketSellers = new ArrayList<>();

    public LotteCinema() {
        initTicketSeller();
    }


    private void initTicketSeller() {
        ticketSellers.add(new TicketSeller(moneyOffice));
        ticketSellers.add(new TicketSeller(moneyOffice));
        ticketSellers.add(new TicketSeller(moneyOffice));
        ticketSellers.add(new AutomaticMarchine(moneyOffice));
        ticketSellers.add(new AutomaticMarchine(moneyOffice));
    }

    void sellTicket(User user) {
        for (Seller ticketSeller : ticketSellers) {
            if (ticketSeller.isBusy()) {
                continue;
            }
            ticketSeller.sellTo(user);
        }
    }

    void showMovie() { }

    public void enter(User user) {
        if (ticketChecker.checkTicket(user.getTicket())) {
            showMovie();
        } else {
            sellTicket(user);
        }
    }
}
