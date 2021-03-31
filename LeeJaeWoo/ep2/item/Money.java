package hw2.item;

import java.math.BigDecimal;

public class Money {
    long money;

    public static final Money ZERO = new Money(0);

    public Money(long money) {
        this.money = money;
    }

    public boolean haveEnoughMoney(Money price) {
        return (this.money > price.money);
    }

    public Money minusMoney(Money price) {
        return new Money(this.money -= price.money);
    }

    public Money plusMoney(Money price) {
        return new Money(this.money += price.money);
    }

    public Money percentDiscountMoney(int percent) {
        if(percent > 100){
            return this;
        }
        return new Money(this.money * (100 - percent) / 100);
    }

}
