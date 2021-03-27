package hw2.seller;

import hw2.user.User;

public class TicketSeller implements Seller {
    private boolean busy = false;
    private MoneyOffice moneyOffice;

    public TicketSeller(MoneyOffice moneyOffice) {
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
