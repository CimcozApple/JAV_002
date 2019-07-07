package lesson05;

public class Figure {
    public int a;
    public int b;
//    protected int b; // для доступа из другого пакета но с extends

    public Figure() {
        this.a = 0;
        this.b = 0;
    }

    public Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int perim() {
        System.out.println("Figure");
        return 0;
    }

    public int area() {
        System.out.println("Area");
        return 0;
    }

    public String toString() {
        return "Figure {" +
                "a = " + a +
                ", b = " + b +
                '}';
    }
}