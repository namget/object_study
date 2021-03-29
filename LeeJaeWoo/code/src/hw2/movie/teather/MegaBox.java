package hw2.movie.teather;

import hw2.movie.event.DiscountEvent;
import hw2.seller.AutomaticMarchine;
import hw2.seller.TicketOffice;
import hw2.seller.Seller;
import hw2.seller.TicketSeller;
import hw2.ticket.TicketChecker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MegaBox extends MovieBrand {

    public MegaBox(DiscountEvent discountEvent) {
        super(discountEvent);
    }

    @Override
    BrandType getBrandType() {
        return BrandType.MEGABOX;
    }

}
