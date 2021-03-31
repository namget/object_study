package hw2.user;

import hw2.item.Money;
import hw2.item.Ticket;

public interface Customer {
    public Money buy(Ticket ticket);

    public void goToHome();
}
