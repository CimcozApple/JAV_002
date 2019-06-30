package lesson08.task;

import java.util.Comparator;

public class SecondSort implements Comparator <User> {
    @Override
    public int compare(User u1, User u2) {
        if (u1.getName().compareTo(u2.getName()) < 0) {
            return 1;
        } else if (u1.getName().compareTo(u2.getName()) > 0) {
            return -1;
        } else {
//        if (this.age > ((User) obj).getAge()) {
            if (u1.getAge() < u2.getAge()) {
                return 1;
//        } else if (this.age < ((User) obj).getAge()) {
            } else if (u1.getAge() > u2.getAge()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}