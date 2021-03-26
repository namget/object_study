public class Theater {

    private final TicketChecker ticketChecker;
    private final TicketSellers ticketSellers;

    public Theater() {
        ticketSellers = new TicketSellers(2, 3);
        ticketChecker = new TicketChecker();
    }

    public boolean enter(Person person) {
        if (ticketChecker.checkValidPersonTicket(person)) {
            return ticketSellers.sellTo(person);
        }
        return false;
    }
}
