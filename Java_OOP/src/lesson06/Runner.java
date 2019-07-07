package lesson06;

public class Runner {
    public static void main(String[] args) {
        Object object = new Object();
        User cat1 = new User("Alex", 20, 60);
        User cat2 = new User("Mark", 20, 60);
        System.out.println(cat1.equals(cat2)); // сравниваем ссылки

        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
    }
}