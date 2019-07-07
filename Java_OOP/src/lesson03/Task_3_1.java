package lesson03;

public class Task_3_1 {
    public static void main(String[] args) {
        User user1 = new User("Bond", 18, 45, "xxx@x.com");
        user1.setAge(-1);
        user1.print();

        System.out.println(user1); // так нельзя, если мы опишим в User - можно
        System.out.println(user1.toString()); // так нельзя, если мы опишим

//        User user2 = new User("Alex", 20);
//        user2.print();
//        System.out.println("Count: " + User.count);
    }
}