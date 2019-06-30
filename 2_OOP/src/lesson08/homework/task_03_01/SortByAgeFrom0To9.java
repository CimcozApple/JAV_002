package lesson08.homework.task_03_01;

import java.util.Comparator;

public class SortByAgeFrom0To9 implements Comparator <Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        if (c1.getAge() > c2.getAge()) {
            return 1;
        } else if (c1.getAge() < c2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}