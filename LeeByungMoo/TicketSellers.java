import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TicketSellers {

    private final List<TicketSeller> ticketSellers;

    public TicketSellers(int kioskCnt, int sellerCnt) {
        Office office = new Office(100);
        ticketSellers = new ArrayList<>();
        for (int i = 0; i < kioskCnt; i++) {
            ticketSellers.add(new Kiosk(office));
        }
        for (int i = 0; i < sellerCnt; i++) {
            ticketSellers.add(new Ticketer(office));
        }
    }

    public boolean sellTo(Person person) {
        Optional<TicketSeller> idleSeller = findIdleSeller();
        if (idleSeller.isPresent()) {
            TicketSeller ticketSeller = idleSeller.get();
            ticketSeller.sellTo(person);
            return true;
        }
        return false;
    }

    public Optional<TicketSeller> findIdleSeller() {
        return this.ticketSellers
                .stream()
                .filter(seller -> seller.isBusy() == false)
                .findFirst();
    }


}
