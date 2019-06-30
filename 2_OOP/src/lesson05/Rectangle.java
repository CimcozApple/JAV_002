package lesson05;

public class Rectangle extends Figure {
    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    public int perim() {
        System.out.println("RectangleFigurePirim");
        return (a + b) * 2;
    }

    @Override
    public int area() {
        System.out.println("RectangleArea");
        return a * b; // проверить
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "a = " + a +
                ", b = " + b +
                '}';
    }
}