package hw2.movie;

import hw2.item.Money;
import hw2.movie.policy.DiscountPolicy;
import hw2.movie.screen.Screening;

import java.time.Duration;

public class Movie {
    private String name;
    private Money money;
    private Duration duration;
    private DiscountPolicy discountPolicy;

    private Movie(String name, Money money, Duration duration, DiscountPolicy discountPolicy){
        this.name = name;
        this.money = money;
        this.duration = duration;
        this.discountPolicy = discountPolicy;
    }

    public String getName() {
        return name;
    }

    public Money getFee(){
        return this.money;
    }

    public Duration getDuration() {
        return duration;
    }

    public Money calculateMovieFee(Screening screening){
        return this.getFee().minusMoney(discountPolicy.getCalculateDiscountAmount(screening));
    }
}
