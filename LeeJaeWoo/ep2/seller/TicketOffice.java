package hw2.seller;

import hw2.item.Money;
import hw2.item.Ticket;
import hw2.movie.event.DiscountEvent;
import hw2.movie.screen.Reservation;
import hw2.movie.screen.Screening;
import hw2.movie.teather.BrandType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketOffice {
    private Money money = new Money(100000);
    private final Map<String, List<Ticket>> ticketMap = new HashMap<>();
    private List<Screening> screenings;
    private final BrandType brandType;
    private DiscountEvent discountEvent;


    public TicketOffice(BrandType brandType, DiscountEvent discountEvents, List<Screening> screenings) {
        this.brandType = brandType;
        this.discountEvent = discountEvents;
        this.screenings = screenings;
        initTicket();
    }

    public List<Screening> getScreenings() {
        return screenings;
    }

    public int getSatisfiedTicketCount(Reservation reservation) {
        return discountEvent.getSatisfiedCount(reservation);
    }

    private void initTicket() {
        for (int i = 0; i < screenings.size(); i++) {
            List<Ticket> ticketList = new ArrayList<>();
            for (int j = 0; j < 100; j++) {
                ticketList.add(new Ticket(screenings.get(i).getMovie(), screenings.get(i).getSequence(), brandType));
            }
            ticketMap.put(screenings.get(i).getMovieName(), ticketList);
        }
    }

    public BrandType getBrandType() {
        return brandType;
    }

    public void plusMoney(Money price) {
        money.plusMoney(price);
    }

    public void changeDiscountEvent(DiscountEvent discountEvents) {
        this.discountEvent = discountEvents;
    }

    public Ticket getTicket(Reservation reservation) {
        List<Ticket> ticketList = ticketMap.get(reservation.getName());

        if (ticketList != null && ticketList.size() > 0) {
            return null;
        }
        return ticketList.remove(ticketList.size() - 1);
    }

}
