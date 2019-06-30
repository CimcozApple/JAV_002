package package1;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Date dd = new Date(System.currentTimeMillis());

        Student student1 = new Student(dd, 201);
        System.out.println(student1);

        Student student2 = (Student) student1.clone();
        System.out.println(student2);
    }
}