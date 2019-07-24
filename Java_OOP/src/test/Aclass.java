package test;

public class Aclass {
    private String color;
    private String brand;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Aclass() {
    }

    public Aclass(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Aclass{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}