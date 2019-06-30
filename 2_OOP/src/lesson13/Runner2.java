package lesson13;

import java.util.*;

public class Runner2 {
    public static void main(String[] args) {
        User u1 = new User("Anna", 18);
        User u2 = new User("Mark", 18);
        User u3 = new User("Mark", 18);
        System.out.println(u1.equals(u2));
        Set<User> list = new HashSet<>();
//        Set<User> list = new ArrayList<>();

        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println(list);
    }
}