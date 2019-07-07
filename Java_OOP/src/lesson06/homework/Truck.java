package lesson06.homework;

public class Truck extends Car {
    private int weight;

    public Truck() {
    }

    public Truck(String brandName, double currentStatusOfFuel, double maxSizeOfGasTankFuel, double avarageOfFuel, int weight) {
        super(brandName, currentStatusOfFuel, maxSizeOfGasTankFuel, avarageOfFuel);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck {" +
                "Weight = " + weight +
                "} " + "\n" +
                super.toString();
    }
}