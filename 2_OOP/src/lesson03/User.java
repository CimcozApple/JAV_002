package lesson03;

public class User {
    private String name;
    private int age;
    private double weight;
    private String email;
    public static int count;

    public String toString() { // есть таких 8 методов, которые понимает Java
        return "User {" +
                "name = " + name + '\'' +
                ", age = " + age +
                ", weight = " + weight +
                ", email = " + email +
                '}';
    }

    User() { // можно не создавать, это уже на правах кодера
    }

    User(String name, int age, double weight, String email) {
//        this.name = name;
//        this.age = age;
        this(name, age); // альтернатива использования в одну строку, написано выше

        this.weight = weight;
        this.email = email;
    }

    User(String name, int age) {
        this.name = name;
        this.age = age;
        count++;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Error");
        } else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /*
    * Из статитки к нестатическим обратиться нельзя или нужно создать объект (new...  тогда можно)
    * Статика позволяет работать со статикой
    * Из не статический к статическими можно
    * */
    static void printCount() {

    }

    void print() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(email);
        System.out.println(count);
    }

    void change() {
        count = 777;
    }
}

/*
* private
* доступ только из текущего класса
*
* protected
* доступ только, если наследуюсь и из другого пакета
*
* default доступ из текущего пакета, наследуясь или нет
*
* public доступ из всех классов, пакетов
* */