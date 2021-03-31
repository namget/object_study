package hw2.movie.screen;

import hw2.user.User;

import java.util.List;

public class Reservation {
    private List<User> users;
    private String name;
    private int sequence;

    public Reservation(List<User> users, String name, int sequence) {
        this.users = users;
        this.name = name;
        this.sequence = sequence;
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return users;
    }

    public boolean isAndAboveUserCount(int count) {
        return users.size() >= count;
    }

    public boolean isAboveAge(int age) {
        for (User user : users) {
            return user.getAge() > age;
        }
        return false;
    }

    public boolean isAndAboveAge(int age) {
        for (User user : users) {
            return user.getAge() >= age;
        }
        return false;
    }


    public boolean isAndUnderAge(int age) {
        for (User user : users) {
            return user.getAge() <= age;
        }
        return false;
    }

    public boolean isUnderAge(int age) {
        for (User user : users) {
            return user.getAge() < age;
        }
        return false;
    }


    public int getSequence() {
        return sequence;
    }
}
