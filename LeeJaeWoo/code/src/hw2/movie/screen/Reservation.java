package hw2.ticket;

import hw2.movie.screen.Screening;
import hw2.user.User;

import java.util.List;

public class Reservation {
    private List<User> users;
    private Screening screening;

    public Reservation(List<User> users, Screening screening){
        this.users = users;
        this.screening = screening;
    }

    public List<User> getUsers() {
        return users;
    }

    public boolean isAndAboveUserCount(int count){
        return users.size() >= count;
    }

    public boolean isAboveAge(int age){
        for(User user : users){
            return user.getAge() > age;
        }
        return false;
    }

    public boolean isAndAboveAge(int age){
        for(User user : users){
            return user.getAge() >= age;
        }
        return false;
    }


    public boolean isAndUnderAge(int age){
        for(User user : users){
            return user.getAge() <= age;
        }
        return false;
    }

    public boolean isUnderAge(int age){
        for(User user : users){
            return user.getAge() < age;
        }
        return false;
    }

    public Screening getScreening() {
        return screening;
    }

    public int getSequence(){
        return screening.getSequence();
    }
}
