package lesson08.homework.task_03_01;

import java.util.Comparator;

public class SortByCountryFromAToZ implements Comparator <Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        if (c1.getAddress().compareTo(c2.getAddress()) < 0) {
            return -1;
        } else if (c1.getAddress().compareTo(c2.getAddress()) > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}