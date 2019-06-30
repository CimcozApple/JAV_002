package lesson08.homework.files_from_group_mate;

class CustomerRunner {
    public static void main(String[] args) {
        Customers list = new Customers();

        list.add(100);
        System.out.println(list);

        list.getListOfCustomer('A');

        System.out.println("\nGet range of the cards: \n");
        list.getRange(43902500600000L, 43902500699999L);

        list.sort();
        System.out.println(list);
    }
}