public class Money implements Comparable<Money> {

    private Integer money;

    public Money(Integer money) {
        this.money = money;
    }

    public void minus(Money payMoney) {
        this.money = money - payMoney.money;
    }

    public void plus(Money payMoney){
        this.money = money + payMoney.money;
    }

    @Override
    public int compareTo(Money o) {
        return this.money - o.money;

    }
}
