package hw1;

class Money {
    int money;

    Money(int money){
        this.money = money;
    }

    boolean haveEnoughMoney(int price){
        return (money > price);
    }

    void minusMoney(int price){
        money -= price;
    }

    void plusMoney(int price) {money += price;}
}
