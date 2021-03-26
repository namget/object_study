public class Person {

    private final Bag bag;
    private final Money money = new Money(20000);

    public Person() {
        this.bag = new Bag();
    }

    public Money pay(Money price) {
        if (money.compareTo(price) >= 0) {
            money.minus(price);
            return price;
        }
        return null;
    }

    public void hold(Ticket ticket) {
        bag.addTicket(ticket);
    }


    public boolean hasTicket() {
        return bag.getTicket() != null;
    }

}
