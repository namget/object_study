

class Bag {
    private Ticket ticket;
    private Invitation invitation;
    private Money money = new Money(22000);

    boolean hasInvitation(){
        return invitation != null;
    }

    void changeInvitationToTicket(Ticket ticket){
        invitation = null;
        this.ticket = ticket;
    }

    Ticket getTicket(){
        return ticket;
    }

    void buyToTicket(int price, Ticket ticket){
        money.minusMoney(price);
        this.ticket = ticket;
    }

    boolean haveEnoughMoney(int price){
        return money.haveEnoughMoney(price);
    }

}
