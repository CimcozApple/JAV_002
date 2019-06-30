package package1;

import java.util.Date;

public class Student implements Cloneable {
    private Date year;
    private int group;

    public Student(Date year, int group) {
        this.year = year;
        this.group = group;
    }

    @Override
    public String toString() {
        return "package1.Student {\n" +
                "year = " + year +
                ",\ngroup = " + group +
                "\n" + '}';
    }

    public Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.year = (Date) this.year.clone();
        return student;
    }
}