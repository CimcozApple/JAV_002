package lesson07;

//public class Dog extends Animal {
public class Dog implements Anim, Reptilia {
    @Override
    public void move() {
        System.out.println("Dog sound");
    }

    @Override
    public void sound() {
        System.out.println("Cat sound");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep Dog");
    }
}