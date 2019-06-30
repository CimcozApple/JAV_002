package lesson06.homework;

public class CarRunner {
    public static void main(String[] args) {
        Car lada = new Car("ВАЗ 2106", 0.0, 39.0, 7.5);
        Car volkswagen = new Car("Volkswagen Passat B5", 0.0, 62.0, 4.5);
        Car peterbilt = new Truck("Peterbilt 379", 0.0, 416.0, 23.0, 8000);

//        System.out.println(car); // or System.out.println(car.toString());
        lada.printInfo();
        lada.addFuel(10);
        System.out.println();

        lada.startEngine();
        lada.startEngine();
        System.out.println();

        lada.goCar(500);
        System.out.println();

        lada.addFuel(29);
        System.out.println();

        lada.goCar(500);
        System.out.println();

        lada.printInfo();
/*********************************************/
        volkswagen.printInfo();
        volkswagen.addFuel(40);
        volkswagen.startEngine();
        volkswagen.goCar(50);
        volkswagen.printInfo();
/*********************************************/
//        peterbilt.addFuel(10);
        peterbilt.printInfo();
    }
}