package hw2.movie.teather;

import hw2.movie.event.DiscountEvent;
import hw2.movie.screen.Screening;
import hw2.seller.AutomaticMarchine;
import hw2.seller.TicketOffice;
import hw2.seller.Seller;
import hw2.ticket.TicketChecker;
import hw2.seller.TicketSeller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CGV extends MovieBrand {

    public CGV(DiscountEvent discountEvent, List<Screening> screenings) {
        super(discountEvent ,screenings);
    }

    @Override
    BrandType getBrandType() {
        return BrandType.CGV;
    }
}
