package lesson05;

public class Triangle extends Figure {
    private int c;

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public int perim() {
        System.out.println("Triangle Perim method");
        return a + b + c;
    }

    @Override
    public int area() {
        System.out.println("TriangleArea");
        return (int) Math.sqrt((a + b + c) * 2);
    }


    @Override
    public String toString() {
        return "Triangle {" +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                '}';
    }
}