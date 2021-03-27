package hw1;

class User {

    private Bag bag;

    User(Bag bag){
        bag = bag;
    }

    public int buy(Ticket ticket) {
        if (bag.hasInvitation()) {
            bag.changeInvitationToTicket(ticket);
            return 0;
        } else if (bag.haveEnoughMoney(ticket.getPrice())) {
            bag.buyToTicket(ticket.getPrice(),ticket);
            return ticket.getPrice();
        }else{
            goToHome();
            return 0;
        }
    }

    Ticket getTicket(){
        return bag.getTicket();
    }

    private void goToHome(){ }

}
