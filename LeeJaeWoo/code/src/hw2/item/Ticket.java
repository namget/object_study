package hw2.item;

import hw2.movie.screen.Screening;
import hw2.movie.teather.BrandType;

import java.time.LocalDateTime;

public class Ticket {
    private Screening screening;
    private BrandType brandType;

    public Ticket(Screening screening , BrandType brandType) {
        this.screening = screening;
        this.brandType = brandType;
    }

    public BrandType getBrandType() {
        return brandType;
    }

    public Screening getScreening() {
        return screening;
    }

    public Money getPrice() {
        return screening.getMovieFee();
    }

    public String ticketName() {
        return screening.getMovieName();
    }

    public LocalDateTime getStartDate(){
        return screening.getStartTime();
    }

}
