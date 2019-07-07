package lesson06;

public class User extends Object {
    String name;
    int age;
    double weight;

    public User(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "User{" +
                "name=" + name +
                ", age='" + age + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(User obj) {
//        if (age == obj.age && weight == obj.weight && name.equals(obj.name)) { // name.equals(obj.name) потому что используем класс String
//            return true;
//        }
//        return false;
//    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        User other = (User) obj;
        if (age == other.age && weight == other.weight) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 + result + age;
        long a = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (a ^ (a >>> 32));
        return result;
    }
}