package hw2;

import hw2.item.Bag;
import hw2.item.Invitation;
import hw2.item.Money;
import hw2.movie.Movie;
import hw2.movie.condition.discount.PeriodDiscountCondition;
import hw2.movie.condition.discount.SequenceDiscountCondition;
import hw2.movie.event.AgeEvent;
import hw2.movie.event.OnePlusOneEvent;
import hw2.movie.event.SequentialEvent;
import hw2.movie.policy.AmountDiscountPolicy;
import hw2.movie.screen.Screening;
import hw2.movie.teather.*;
import hw2.user.User;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class main {

    private List<User> users = new ArrayList<>();
    private List<MovieBrand> movieBrands = new ArrayList<>();
    private List<Screening> screenings = new ArrayList<>();


    public void main(String[] args) {
        init();
    }

    private void init() {
        initUser();
        initBrand();
        initScreen();
        for (User user : users) {
//            CGV.enter(user, u);
        }
    }

    private void initScreen() {
        screenings.add(
        new Screening(new Movie("인턴", new Money(10000), Duration.ofHours(1),
                new AmountDiscountPolicy(new Money(800), new PeriodDiscountCondition(LocalDate.now(), LocalDate.now(), DayOfWeek.MONDAY),
                        new SequenceDiscountCondition(2))), 1, LocalDateTime.now()));
        screenings.add(
                new Screening(new Movie("어벤저스", new Money(10000), Duration.ofHours(1),
                        new AmountDiscountPolicy(new Money(800), new SequenceDiscountCondition(1),
                                new SequenceDiscountCondition(2))), 2, LocalDateTime.now()));
    }


    private void initUser() {
        users.add(new User(new Bag(new Invitation("lee")), 10));
        users.add(new User(new Bag(new Money(10000)), 10));
        users.add(new User(new Bag(new Money(0)), 10));
        users.add(new User(new Bag(new Money(30000)), 10));
        users.add(new User(new Bag(new Invitation("kim"), new Money(25000)), 10));
    }

    private void initBrand() {
        movieBrands.add(new CGV(new AgeEvent()));
        movieBrands.add(new LotteCinema(new SequentialEvent(3)));
        movieBrands.add(new MegaBox(new OnePlusOneEvent()));
    }

}
