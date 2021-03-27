package hw2.item;

public class Ticket {
    public Ticket(int price){
        this.price = price;
    }

    private Money price = new Money(10000);

    public Money getPrice() {
        return price;
    }
}
