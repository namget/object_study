package hw2.seller;

import hw2.user.User;

public interface Seller {
    boolean isBusy();
    void sellTo(User user);
}
