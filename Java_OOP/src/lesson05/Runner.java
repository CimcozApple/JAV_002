package lesson05;

public class Runner {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5, 10);
        System.out.println(rec.toString());
        System.out.println(rec.perim());
        System.out.println(rec.area());

        Triangle tri = new Triangle(5, 5, 5);
        System.out.println(tri);
        System.out.println(tri.perim());

    }
}