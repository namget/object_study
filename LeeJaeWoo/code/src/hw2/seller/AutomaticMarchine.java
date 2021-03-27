package hw2.seller;

import hw2.user.User;

public class AutomaticMarchine implements Seller {
    private boolean busy = false;
    private MoneyOffice moneyOffice;

    public AutomaticMarchine(MoneyOffice moneyOffice) {
        this.moneyOffice = moneyOffice;
    }

    @Override
    public boolean isBusy() {
        return busy;
    }

    @Override
    public void sellTo(User user) {
        busy = true;
        moneyOffice.plusMoney(user.buy(moneyOffice.getTicket()));
    }

}
