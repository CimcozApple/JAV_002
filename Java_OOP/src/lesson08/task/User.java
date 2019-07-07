package lesson08.task;

import java.util.Objects;

public class User implements Comparable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int compareTo(Object obj) {
        if (this == obj) {
            return 0;
        }

        User user = (User) obj;
        if (this.name.compareTo(user.getName()) > 0) {
            return 1;
        } else if (this.name.compareTo(user.getName()) < 0) {
            return -1;
        } else {
//        if (this.age > ((User) obj).getAge()) {
            if (this.age > user.getAge()) {
                return 1;
//        } else if (this.age < ((User) obj).getAge()) {
            } else if (this.age < user.getAge()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}