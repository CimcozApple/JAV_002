package lesson08.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        Users users = new Users();

        users.addUser(new User("Anna", 104));
        users.addUser(new User("Olya", 55));
        users.addUser(new User("Bim", 140));
        users.addUser(new User("Hannoi", 13));
        users.addUser(new User("Anna", 77));
        System.out.println(users);

//        System.out.println(users.getUser(0).equals(users.getUser(2)));
        System.out.println(users.getUser(0).equals(users.getUser(4)));
        System.out.println(users.getUser(0) == users.getUser(4));
//        System.out.println(users.getUser(0).compareTo(users.getUser(4)));

        /*
        * 1
        * */
        ArrayList<User> newList = users.getArrayList();
        System.out.println("BEFORE: " + newList);
        Collections.sort(newList);
        System.out.println("AFTER: " + newList); // by Name from A to Z

        /*
        * 2
        * */
        newList.sort(new SecondSort());
        System.out.println("SECOND: " + newList); // by Name from Z to A

        /*
        * 3
        * */
        newList.sort(new Comparator<User>() {
        @Override
        public int compare(User u1, User u2) {
    //        if (this.age > ((User) obj).getAge()) {
            if (u1.getAge() < u2.getAge()) {
                return 1;
    //        } else if (this.age < ((User) obj).getAge()) {
            } else if (u1.getAge() > u2.getAge()) {
                return -1;
            } else {
                return 0;
            }
        }});
        System.out.println("FINALY: " + newList); // by Age from 9 to 0
    }
}