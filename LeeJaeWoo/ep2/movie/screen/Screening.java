package hw2.movie.screen;

import hw2.item.Money;
import hw2.movie.Movie;

import java.time.LocalDateTime;

public class Screening {

    private final Movie movie;
    private final int sequence;
    private final LocalDateTime whenScreened;


    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    private Money calculateFee() {
        return movie.calculateMovieFee(this);
    }

    public String getMovieName() {
        return movie.getName();
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

    public Movie getMovie(){
        return movie;
    }

    public void setMovieFee(Money money){
        movie.setFee(money);
    }

    public int getSequence() {
        return sequence;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    public LocalDateTime getEndTime() {
        return whenScreened.plusMinutes(movie.getDuration().toMinutes());
    }

    public boolean compareScreen(Screening screening) {
        return this.whenScreened == screening.whenScreened &&
                this.movie.getName().equals(screening.movie.getName());
    }
}
