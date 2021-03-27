package hw1;

class Ticket {
    Ticket(int price){
        this.price = price;
    }

    private int price = 10000;

    public int getPrice() {
        return price;
    }
}
