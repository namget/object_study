package hw2.user;

import hw2.item.Bag;
import hw2.item.Money;
import hw2.item.Ticket;

import java.util.List;

public class User {

    private int age;
    private Bag bag;

    public User(Bag bag, int age) {
        this.bag = bag;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Money buy(Ticket ticket) {
        if (bag.hasTicket()) {
            return Money.ZERO;
        } else if (bag.hasInvitation()) {
            bag.changeInvitationToTicket(ticket);
            return Money.ZERO;
        } else if (bag.haveEnoughMoney(ticket.getPrice())) {
            bag.buyToTicket(ticket.getPrice(), ticket);
            return ticket.getPrice();
        } else {
            goToHome();
            return Money.ZERO;
        }
    }

    public Ticket getTicket() {
        return bag.getTicket();
    }

    public void goToHome() {
    }
}
