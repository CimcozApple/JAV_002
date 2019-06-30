package lesson08.homework.task_03_01;

import java.util.ArrayList;

/*
* Number 1
* 1 - Получить список покупателей, чьи фамилии начинаются с буквы К
* 2 - Получить список покупателей, у которых номер кредитной карточки находится в указанном диапазоне
* 3 - Упорядочить покупателей согласно адресу проживания
* */
public class ZRunner {
    public static void main(String [] args) {
//        Customer customer = new Customer("Valerka", "Revolverovich", "Moiseenko", 75, "Moscow", 6738_6273, 1234_5678_9000_0001L);
//        System.out.println(customer);

        Customers customers = new Customers();
        customers.addCustomer(new Customer("Jeff", "Bezos", "Mork", 54, "USA", 6738_6273, 1234_5678_9000_0001L));
        customers.addCustomer(new Customer("Bill", "Gates", "Micr", 63, "Russia", 6728_6273, 1234_5678_9000_0002L));
        customers.addCustomer(new Customer("Warren", "Buffett", "Buf", 88, "Ukraine", 1118_6273, 1234_5678_9000_0003L));
        customers.addCustomer(new Customer("Mark", "Zuckerberg", "Face", 34, "Ukraine", 1118_0000, 1234_5678_9000_0004L));
        customers.addCustomer(new Customer("Larry", "Ellison", "Mr. L", 74, "USA", 1118_0740, 1234_5678_9000_0005L));
        customers.addCustomer(new Customer("Larry", "Page", "Gle", 45, "Canada", 0000_0001, 1234_5678_9000_0006L));
        customers.addCustomer(new Customer("Charles", "Koch", "K2", 82, "Canada", 6642_0921, 1234_5678_9000_0007L));
        customers.addCustomer(new Customer("David", "Koch", "Ko", 78, "Canada", 9364_2311, 1234_5678_9000_0008L));
        customers.addCustomer(new Customer("Sergey", "Brin", "Goo", 45, "USA", 0000_0002, 1234_5678_9000_0009L));
        customers.addCustomer(new Customer("Michael", "Bloomberg", "Bloom", 76, "Ukraine", 4212_5323, 1234_5678_9000_0010L));

        ArrayList <Customer> customer = customers.getCustomerArrayList();

//        System.out.println("BEFORE 'AGE' SORTING ---> ORIGINAL ARRAY:\n" + customer + "\n");
//        customer.sort(new SortByAgeFrom9To0());
//        System.out.println("AFTER 'AGE' SORTING FROM 9 TO 0:\n" + customer + "\n");

//        System.out.println("BEFORE 'COUNTRY' SORTING ---> ORIGINAL ARRAY:\n" + customer + "\n");
//        customer.sort(new SortByCountryFromAToZ());
//        System.out.println("AFTER 'COUNTRY' SORTING ---> FROM A TO Z:\n" + customer + "\n");

//        ArrayList <Customer> customer2 = customers.getCustomerArrayList();
//        System.out.println("customer2\n" + customer2 + "\n");

        // debug
        System.out.println("ORIGINAL ARRAY:\n" + customer + "\n");
        ArrayList <Customer> customer3 = customers.getCustomerArrayList2();
        System.out.println("customer3\n" + customer3 + "\n");

        customers.filterByUKRAINECountry();
//        customers.filterByFirstName("");

        System.out.println("customer3\n" + customer3 + "\n");
        // debug

//        customer.sort(new SortByAgeFrom0To9());
//        System.out.println("AFTER 'AGE' SORTING FROM 0 TO 9:\n" + customer + "\n");

//        System.out.print("AFTER FILTER BY '...': ");
//        customers.filterByUKRAINECountry();
//        customers.filterByUSACountry();
//        customers.filterByRUSSIACountry();
//        customers.filterByFirstName("L");



//        System.out.println("AFTER FILTER 'Last Name' BY 'K':");
//        customers.filterByLastName("K");


//        System.out.println("AFTER FILTER 'Credit Card' FROM '1234_5678_9000_0005L' TO '1234_5678_9000_0010L':");
//        customers.filterByCREDITCARD(1234_5678_9000_0005L, 1234_5678_9000_0010L);
    }
}