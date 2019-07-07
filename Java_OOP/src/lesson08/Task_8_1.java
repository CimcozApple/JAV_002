package lesson08;

public class Task_8_1 {
    public static void main(String[] args) {
        Integer intObject1 = new Integer(100);
        Integer intObject2 = new Integer("100");
        Integer intObject3 = Integer.valueOf("11");
        Double doubleObject1 = new Double(0.01);
        Double doubleObject2 = new Double("0.01");
        Double doubleObject3 = Double.valueOf("11.1");

        int i = intObject1;
        i++;
        intObject1 = i;
    }
}



