package hw2.movie.teather;

import hw2.movie.event.DiscountEvent;
import hw2.movie.screen.Screening;

import java.util.List;

public class LotteCinema extends MovieBrand {

    public LotteCinema(DiscountEvent discountEvent , List<Screening> screenings) {
        super(discountEvent , screenings);
    }

    @Override
    BrandType getBrandType() {
        return BrandType.LOTTE_CINEMA;
    }


}
