package hw2;

import hw2.item.Bag;
import hw2.item.Invitation;
import hw2.item.Money;
import hw2.movie.teather.CGV;
import hw2.user.User;

import java.util.ArrayList;
import java.util.List;

public class main {

    private List<User> users = new ArrayList<>();
    private CGV CGV = new CGV();


    public void main(String[] args) {
        init();
    }

    private void init() {
        initUser();
        for (User user : users) {
            CGV.enter(user);
        }
    }


    private void initUser() {
        users.add(new User(new Bag(new Invitation("lee")), 10));
        users.add(new User(new Bag(new Money(10000)), 10));
        users.add(new User(new Bag(new Money(0)), 10));
        users.add(new User(new Bag(new Money(30000)), 10));
        users.add(new User(new Bag(new Invitation("kim"), new Money(25000)), 10));
    }

}
