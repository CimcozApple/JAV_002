package lesson10;

public class Task_10_5 {
    public static void main(String[] args) {
        String str3 = "$1.15";
        String regex = "^\\$[0-9]+(\\.[0-9])?+.*$";

        System.out.println(regex);
        System.out.println(str3.matches(regex));
    }
}