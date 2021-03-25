public abstract class TicketSeller {
    private boolean busy = false;
    private final Office office;


    public TicketSeller(Office office) {
        this.office = office;
    }

    boolean isBusy() {
        return this.busy;
    }

    void setBusy(boolean busy) {
        this.busy = busy;
    }

    void sellTo(Person person) {
        setBusy(true);
        Money money = person.pay(Ticket.price);
        if (money != null) {
            Ticket ticket = this.office.sellTicket(money);
            person.hold(ticket);
        }
        setBusy(false);
    }

}
