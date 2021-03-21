
import java.util.ArrayList;
import java.util.List;

class MoneyOffice {
    private Money money;
    private List<Ticket> ticket = new ArrayList<Ticket>();

    private void makeTicket() {
        for (int i = 0; i < 100; i++) {
            ticket.add(new Ticket(10000));
        }
    }

    public void plusMoney(int price){
        money.plusMoney(price);
    }

    Ticket getTicket()  {
        if (ticket.isEmpty()) {
            makeTicket();
        }
        return ticket.remove(ticket.size() - 1);
    }

}
