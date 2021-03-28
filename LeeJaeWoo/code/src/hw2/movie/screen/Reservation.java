package hw2.movie.screen;

import hw2.item.Money;
import hw2.user.Customer;

public class Reservation {

    private Customer customer;
    private Screening screening;
    private Money money;


    public Reservation(Customer customer, Screening screening, Money money) {
        this.customer = customer;
        this.screening = screening;
        this.money = money;
    }
}
