public class Bag {

    private Ticket ticket = null;

    public void addTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
