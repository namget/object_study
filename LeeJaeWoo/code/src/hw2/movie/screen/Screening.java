package hw2.movie.screen;

import hw2.item.Money;
import hw2.movie.Movie;

import java.time.LocalDateTime;

public class Screening {

    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened){
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    private Money calculateFee(){
        return movie.calculateMovieFee(this);
    }

    public Money getMovieFee(){
        return movie.getFee();
    }

    public boolean isSequence(int sequence){
        return this.sequence == sequence;
    }

    public LocalDateTime getStartTime(){
        return whenScreened;
    }

    public LocalDateTime getEndTime(){
        return whenScreened.plusMinutes(movie.getDuration().toMinutes());
    }

}
