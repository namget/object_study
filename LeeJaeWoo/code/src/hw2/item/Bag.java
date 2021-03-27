package hw2.item;

public class Bag {

    public Bag(Invitation invitation) {
        this.invitation = invitation;
    }

    public Bag(Money money) {
        this.money = money;
    }

    public Bag(Invitation invitation, Money money) {
        this.invitation = invitation;
        this.money = money;
    }

    private Ticket ticket = null;
    private Invitation invitation;
    private Money money;

    public boolean hasInvitation() {
        return invitation != null;
    }

    public void changeInvitationToTicket(Ticket ticket) {
        invitation = null;
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void buyToTicket(Money price, Ticket ticket) {
        money.minusMoney(price);
        this.ticket = ticket;
    }

    public boolean haveEnoughMoney(Money price) {
        return money.haveEnoughMoney(price);
    }

}
