package hw2.movie.teather;

import hw2.movie.event.DiscountEvent;

public class LotteCinema extends MovieBrand {

    public LotteCinema(DiscountEvent discountEvent) {
        super(discountEvent);
    }

    @Override
    BrandType getBrandType() {
        return BrandType.LOTTE_CINEMA;
    }


}
