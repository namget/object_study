package hw1;

class Bag {

    Bag(Invitation invitation) {
        this.invitation = invitation;
    }

    Bag(Money money) {
        this.money = money;
    }

    Bag(Invitation invitation, Money money) {
        this.invitation = invitation;
        this.money = money;
    }

    private Ticket ticket = null;
    private Invitation invitation;
    private Money money;

    boolean hasInvitation() {
        return invitation != null;
    }

    void changeInvitationToTicket(Ticket ticket) {
        invitation = null;
        this.ticket = ticket;
    }

    Ticket getTicket() {
        return ticket;
    }

    void buyToTicket(int price, Ticket ticket) {
        money.minusMoney(price);
        this.ticket = ticket;
    }

    boolean haveEnoughMoney(int price) {
        return money.haveEnoughMoney(price);
    }

}
