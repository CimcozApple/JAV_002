package lesson02.homework;

public class HomeClass02 {
    public static void main(String [] args) {
        towerOfHanoi(3, 2);
    }

    public static void towerOfHanoi(int howManyRods, int howManyDisks) {

        if (howManyRods < 10) {
            towerOfHanoi(howManyRods, howManyDisks);
        }
    }
}