package hw2.user;

import hw2.item.Bag;
import hw2.item.Money;
import hw2.item.Ticket;

public class User implements Customer {

    private int age;
    private Bag bag;

    public User(Bag bag, int age) {
        this.bag = bag;
        this.age = age;
    }

    @Override
    public Money buy(Ticket ticket) {
        if (bag.hasInvitation()) {
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

    @Override
    public void goToHome() {
    }
}
