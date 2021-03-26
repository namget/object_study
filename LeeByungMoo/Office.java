import java.util.ArrayList;
import java.util.List;

public class Office {

    private final List<Ticket> tickets = new ArrayList<>();

    private final Money holdingMoney = new Money(0);


    public Office(int ticketCnt) {
        for (int i = 0; i < ticketCnt; i++) {
            tickets.add(new Ticket());
        }
    }

    public Ticket sellTicket(Money money) {
        if (hasTicket() && Ticket.available(money)) {
            holdingMoney.plus(money);
            return getTicket();
        }
        return null;
    }

    private Ticket getTicket() {
        return this.tickets.remove(0);
    }

    private boolean hasTicket() {
        return tickets.size() != 0;
    }
}
