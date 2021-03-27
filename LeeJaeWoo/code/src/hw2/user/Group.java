package hw2.user;

import hw2.item.Ticket;

import java.util.List;

public class Group implements Customer{
    private List<User> users;

    public Group(List<User> users){
        this.users = users;
    }

    @Override
    public int buy(Ticket ticket) {
        return 0;
    }

    @Override
    public void goToHome() { }
}
