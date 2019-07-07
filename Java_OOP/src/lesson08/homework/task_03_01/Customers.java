package lesson08.homework.task_03_01;

import java.util.ArrayList;
import java.util.Collection;

public class Customers {
    ArrayList<Customer> customerArrayList = new ArrayList<>();
    ArrayList<Customer> customerArrayList2 = new ArrayList<>();

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public ArrayList<Customer> getCustomerArrayList2() {
        return customerArrayList2;
    }
/*****************************************************************************************************************************/

    public void addCustomer(Customer customer) {
        this.customerArrayList.add(customer);
    }

    public Customer getCustomer(int index) {
        return customerArrayList.get(index);
    }
/*****************************************************************************************************************************/
    public void filterByUKRAINECountry() {
        customerArrayList2.clear();
        for (Customer user : customerArrayList) {
            if (user.getAddress().contains("Ukraine")) {
                customerArrayList2.add(user);
//                System.out.print(user);
            }
        }
    }

    public void filterByUSACountry() {
        for (Customer user : customerArrayList) {
            if (user.getAddress().contains("USA")) {
                System.out.print(user);
            }
        }
    }

    public void filterByRUSSIACountry() {
        for (Customer user : customerArrayList) {
            if (user.getAddress().contains("Russia")) {
                System.out.print(user);
            }
        }
    }

    public void filterByCREDITCARD(Long creditCardFrom, Long creditCardTo) {
        for (Customer user : customerArrayList) {
            if (user.getCreditCard() >= creditCardFrom & user.getCreditCard() <= creditCardTo) {
                System.out.print(user);
            } else if (user.getCreditCard() <= creditCardFrom & user.getCreditCard() >= creditCardTo)
                System.out.print(user);
        }
    }

    public void filterByFirstName(String firstName) {
        customerArrayList2.clear();
        for (Customer user : customerArrayList) {
            if (user.getFirstName().contains(firstName)) {
                customerArrayList2.add(user);
//                System.out.print(user);
            }
        }
    }

    public void filterByLastName(String lastName) {
        for (Customer user : customerArrayList) {
            if (user.getLastName().contains(lastName)) {
                System.out.print(user);
            }
        }
    }
/*****************************************************************************************************************************/
    /*
    * Выводит только лист
    * */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Customer c : customerArrayList) {
            sb.append(c.getFirstName());
            sb.append(" ");
            sb.append(c.getLastName());
            sb.append(" ");
            sb.append(c.getMiddleName());
            sb.append(" ");
            sb.append(c.getAge());
            sb.append(" ");
            sb.append(c.getAddress());
            sb.append(" ");
            sb.append(c.getBankAccount());
            sb.append(" ");
            sb.append(c.getCreditCard());
            sb.append("\n");
        }
        return sb.toString();
    }
}