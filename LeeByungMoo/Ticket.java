public class Ticket {

    public final static Money price = new Money(10000);

    public static boolean available(Money money) {
        return money.compareTo(Ticket.price) >= 0;
    }

}
