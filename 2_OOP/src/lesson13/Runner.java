package lesson13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        User u1 = new User("Anna", 18);
        User u2 = new User("Mark", 18);
        System.out.println(u1.equals(u2));

//        ArrayList<User> list = new ArrayList<>();
//        List<User> list = new ArrayList<>();
        List<User> list = new LinkedList<>();

        list.add(u1);
        list.add(u2);
//        ((ArrayList)list).trimToSize();

        System.out.println(list);
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println(list);
    }
}