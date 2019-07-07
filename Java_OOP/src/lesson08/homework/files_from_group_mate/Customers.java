package lesson08.homework.files_from_group_mate;

import java.util.ArrayList;
import java.util.Collections;

class Customers {
    ArrayList<Customer> list = new ArrayList<Customer>();

    String[] names = {"Anna ","Mark ","Gulia","Tolik","Sonya","Aleks","Mary ","Kuzma","Anton","Maks ","Galya","Tanya","Gena ","Myra ","Kyra "};
    String[] adres = {"Kiyv   ","Poltava","Vinitsa","Odesa  ","Lviv   ","Yalta  ","Kharkov","Dnepr  ","Rovno  ","Berlin ","Uzgorod","Rym    ","Parizh "};
    int[] pan = {439025004,439025003,439025006,439025001, 439025005, 439025002};
    String accounts = "262500";

    public ArrayList<Customer> getList() {
        return list;
    }



    public void getCustomer(Customer customer) {
        customer.setName(names[(int)(Math.random()*15)]);
        customer.setAdress(adres[(int)(Math.random()*13)]);
        long card = (int)(10000+Math.random()*89999);
        long i = pan[(int)(Math.random()*4)];
        long k = Long.valueOf(String.valueOf(i) + String.valueOf(card));
        customer.setPAN(k);  // customer.setPAN(pan[(int)(Math.random()*4)] + "" + card);
        customer.setAccount(accounts + (int)(10000+Math.random()*29999));
    }

    public void add(Customer customer) {
        //list.add(customer);
        getCustomer(customer);
        list.add(new Customer(customer.getName(), customer.getAdress(),
                customer.getAccount(),customer.getPAN()));
    }

    public void add(int k) {
        Customer customer = new Customer();
        for(int i = 0; i < k; i++){
            getCustomer(customer);
            list.add(new Customer(customer.getName(), customer.getAdress(),
                    customer.getAccount(),customer.getPAN()));
        }
    }

    public void getListOfCustomer(char c) {
        System.out.println("Filter on capital letter: " + c + "\n");
        int id = 0;
        int result = 0;
        for(Customer cm: list) {
            if(cm.getName().charAt(0) == c) {
                System.out.println(list.get(id));
                result++;
            }
            id++;
        }
        if(result == 0) {
            System.out.println("No such name");
        }
    }

    public void getRange(long start, long end) {
        int i =0;
        for(Customer cm: list) {
            if(start < cm.getPAN() && cm.getPAN() < end ) {

                System.out.println(list.get(i));
            }
            i++;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb =  new StringBuilder();
        for(Customer ct: list) {
            sb.append(ct.getName()).append(" ").append(ct.getAdress()).append(" ").append(ct.getAccount()).append(" ").append(ct.getPAN()).append("\n");
            //sb.append(ct.getName() + " " + ct.getAdress() + " " +ct.getPAN() + " " + ct.getAccount() + "\n");
        }
        return sb.toString();
    }
    public void sort() {
        Collections.sort(list);
    }
}