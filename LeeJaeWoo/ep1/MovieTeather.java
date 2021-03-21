

import java.util.ArrayList;
import java.util.List;

class MovieTeather {
    private List<Seller> ticketSellers = new ArrayList<>();
    private MoneyOffice moneyOffice = new MoneyOffice();
    private TicketChecker ticketChecker = new TicketChecker();


    MovieTeather() {
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

    void showMovie() {

    }

    void enter(User user) {
        if (ticketChecker.checkTicket(user.getTicket())) {
            showMovie();
        } else {
            sellTicket(user);
        }
    }
}
