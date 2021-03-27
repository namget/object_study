package hw1;

import java.util.ArrayList;
import java.util.List;

public class main {

    private List<User> users = new ArrayList<>();
    private MovieTeather movieTeather = new MovieTeather();

    public void main(String[] args) {
        init();
    }

    private void init() {
        initUser();
        for (User user : users) {
            movieTeather.enter(user);
        }
    }


    private void initUser() {
        users.add(new User(new Bag(new Invitation("lee"))));
        users.add(new User(new Bag(new Money(10000))));
        users.add(new User(new Bag(new Money(0))));
        users.add(new User(new Bag(new Money(30000))));
        users.add(new User(new Bag(new Invitation("kim"), new Money(25000))));
    }

}
