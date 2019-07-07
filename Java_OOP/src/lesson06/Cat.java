package lesson06;

public class Cat {
    public void move() {
        System.out.println("Cat move");
    }
}
/*****************************************************************************************************************************/
class BritishCat extends Cat {
    @Override
    public void move() {
        System.out.println("British cat move");
    }

    public void sound() {
        System.out.println("Мау");
    }
}
/*****************************************************************************************************************************/
class PersianCat extends Cat {
    @Override
    public void move() {
        System.out.println("Persian cat move");
    }
}