package hw2.seller;

import hw2.movie.screen.Screening;
import hw2.user.User;

import java.util.List;

public interface Seller {
    public void sellTo(List<User> user, Screening screening);
}
