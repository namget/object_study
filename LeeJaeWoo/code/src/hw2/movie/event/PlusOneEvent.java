package hw2.movie.event;

public class PlusOneEvent implements Event {
    private PlusEvent plusEvent;

    public PlusOneEvent(PlusEvent plusEvent){
        this.plusEvent = plusEvent;
    }

}
