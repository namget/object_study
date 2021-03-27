package hw2.movie.condition.discount;

import hw2.movie.screen.Screening;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class PeriodDiscountCondition implements DiscountCondition {

    private LocalDate startTime;
    private LocalDate endTime;
    private DayOfWeek dayOfWeek;

    PeriodDiscountCondition(LocalDate startTime, LocalDate endTime, DayOfWeek dayOfWeek){
        this.startTime = startTime;
        this.endTime = endTime;
        this.dayOfWeek = dayOfWeek;
    }
    @Override
    public boolean isSatisfied(Screening screening) {
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek)&&
                startTime.compareTo(screening.getStartTime().toLocalDate()) <= 0 &&
                endTime.compareTo(screening.getEndTime().toLocalDate()) >= 0;
    }
}




