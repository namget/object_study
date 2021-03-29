package hw2.seller;

import hw2.item.Money;
import hw2.item.Ticket;
import hw2.movie.event.DiscountEvent;
import hw2.movie.screen.Screening;
import hw2.movie.teather.BrandType;
import hw2.ticket.Reservation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketOffice {
    private Money money = new Money(100000);
    private final Map<String, List<Ticket>> ticketMap = new HashMap<>();
    private final BrandType brandType;
    private DiscountEvent discountEvent;


    public TicketOffice(BrandType brandType, DiscountEvent discountEvents) {
        this.brandType = brandType;
        this.discountEvent = discountEvents;
    }

    public int getSatisfiedTicketCount(Reservation reservation) {
        return discountEvent.getSatisfiedCount(reservation);
    }

    private void initTicket() {
//        ticket.add(new Ticket(new Screening(new Movie()), brandType));
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

    public Ticket getTicket(Screening screening) {
        List<Ticket> ticketList = ticketMap.get(screening.getMovieName());

        if (ticketList.size() > 0) {
            return null;
        }
        return ticketList.remove(ticketList.size() - 1);
    }

}
