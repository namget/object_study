package hw1;

class AutomaticMarchine implements Seller {
    private boolean busy = false;
    private MoneyOffice moneyOffice;

    AutomaticMarchine(MoneyOffice moneyOffice) {
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
