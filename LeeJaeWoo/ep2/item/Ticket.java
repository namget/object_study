package hw2.item;

import hw2.movie.Movie;
import hw2.movie.teather.BrandType;

public class Ticket {
    private Movie movie;
    private int sequence;
    private BrandType brandType;

    public Ticket(Movie movie, int sequence, BrandType brandType) {
        this.movie = movie;
        this.sequence = sequence;
        this.brandType = brandType;
    }

    public BrandType getBrandType() {
        return brandType;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getSequence() {
        return sequence;
    }

    public void setPrice(Money money){
        movie.setFee(money);
    }

    public Money getPrice() {
        return movie.getFee();
    }

    public String ticketName() {
        return movie.getName();
    }

}
