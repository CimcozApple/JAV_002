package lesson14;

import java.util.*;

public class Runner2 {
    public static void main(String[] args) {
        User u1 = new User("Anna", 18);
        User u2 = new User("Anna", 18);
        User u3 = new User("Mark", 18);
        User u4 = new User("Jack", 18);
        User u5 = new User("Mike", 18);
        System.out.println(u1.equals(u2));
        Set<User> list = new HashSet<>();
//        Set<User> list = new ArrayList<>();

        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);

        System.out.println(list);

        for (User u : list) {
            System.out.println(u);
        }
        System.out.println("*********************");

        /*************************/
        Set<User> list2 = new HashSet<>(list); // копируем содержимое листа в новый лист list2
        List<User> list3 = new ArrayList<>(list); // в новый List копируем содержимое листа в новый лист list2
        /*************************/

        Iterator<User> iter = list.iterator();
        while (iter.hasNext()) {
            User u = iter.next();
            System.out.println(u);
            iter.remove();
        }
        System.out.println(list);

    }
}