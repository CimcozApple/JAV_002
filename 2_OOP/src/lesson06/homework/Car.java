package lesson06.homework;

public class Car {
    private String brandName;
    private double currentStatusOfFuel;
    private double maxSizeOfGasTankFuel;
    private double avarageOfFuel;
    private double distance;
    private boolean isEngineOn;

    private int weight;

    public Car() {
    }

    public Car(int weight) {
        this.weight = weight;
    }

    public Car(String brandName, double currentStatusOfFuel, double maxSizeOfGasTankFuel, double avarageOfFuel) {
        if (currentStatusOfFuel > maxSizeOfGasTankFuel) {
            System.out.println("Current status of fuel '" + currentStatusOfFuel + "' more than max size of gas tank fuel '" + maxSizeOfGasTankFuel + "'");
            return;
        } else if (currentStatusOfFuel < 0) {
            System.out.println("Current status of fuel equals '" + currentStatusOfFuel + "' liters");
            System.out.println("It should be '" + 0 + "' or more");
            return;
        }

        this.brandName = brandName;
        this.currentStatusOfFuel = currentStatusOfFuel;
        this.maxSizeOfGasTankFuel = maxSizeOfGasTankFuel;
        this.avarageOfFuel = avarageOfFuel;
    }

    public double getCurrentStatusOfFuel() {
        return currentStatusOfFuel;
    }

    public void setCurrentStatusOfFuel(double newFuelValue) {
        this.currentStatusOfFuel = newFuelValue;
    }

    @Override
    public String toString() {
        return "- - - - - Car {\n" +
                "Car brand = '" + brandName + '\'' +
                ", \nCurrent status of fuel = " + currentStatusOfFuel + " liter(s)" +
                ", \nMax size of gas tank fuel = " + maxSizeOfGasTankFuel + " liter(s)" +
                ", \nAvarage of fuel = " + avarageOfFuel + " liter(s) per 100 KM" +
                ", \nDistance I drove = " + distance + " KM" +
                ", \nIs engine on = " + isEngineOn + "\n" +
                '}';
    }

    public void addFuel(double fuel) {
        if (fuel < 0) {
            System.out.println("Value '" + fuel + "' less than '" + 0 + "'");
            return;
        } else if (fuel > maxSizeOfGasTankFuel) {
            System.out.println("Value '" + fuel + "' more than max size of gas tank fuel '" + maxSizeOfGasTankFuel + "'");
            return;
        } else if (fuel + currentStatusOfFuel > maxSizeOfGasTankFuel) {
            System.out.println("Value '" + fuel + "' does not fit in the current gas tank");
            System.out.println("Current status of fuel - '" + currentStatusOfFuel + "'");
            System.out.println("Maximal size of gas tank - '" + maxSizeOfGasTankFuel + "'");
            return;
        } else if (fuel + currentStatusOfFuel <= maxSizeOfGasTankFuel) {
            setCurrentStatusOfFuel(currentStatusOfFuel + fuel);
            System.out.println("Added '" + fuel + "' liter(s)");
//            System.out.println("Current Status Of Fuel " + getCurrentStatusOfFuel() + " liters");
        }
    }

    public void startEngine() {
        if (getCurrentStatusOfFuel() == 0) {
            System.out.println("Fuel tank is empty");
            return;
        } else {
            if (this.isEngineOn == false) {
                isEngineOn = true;
                System.out.println("Engine was started");
            } else {
                System.out.println("Rrrrrrr, engine IS WORKING, DON'T DO IT AGAIN!!!");
            }
        }
    }

    public void goCar(double iShouldDriveN) {
        this.distance = iShouldDriveN;

        if (isEngineOn == false) {
            startEngine();
        }

        double iWillDriveWithCurrentVolumeOfFuelTank = getCurrentStatusOfFuel() / avarageOfFuel * 100;
        double howManyFuelIWillSpend = iShouldDriveN * avarageOfFuel / 100;
        double howManyLitersRemainInFuelTank = getCurrentStatusOfFuel() - howManyFuelIWillSpend;

        if (iWillDriveWithCurrentVolumeOfFuelTank >= iShouldDriveN) {
            System.out.println("Fuel is ENOUGH for this journey of '" + distance + "' kilometers");
            System.out.println("Will spend - '" + howManyFuelIWillSpend + "' liter(s)");
            System.out.println("Will remain - '" + howManyLitersRemainInFuelTank + "' liter(s)");
            setCurrentStatusOfFuel(getCurrentStatusOfFuel() - howManyFuelIWillSpend);
            return;
        } else {
            System.out.println("Fuel is NOT ENOUGH for this journey of '" + distance + "' kilometers");
            return;
        }
    }

    public void printInfo() {
        System.out.println(toString());
        System.out.println();
    }
}