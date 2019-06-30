package lesson09;

public class Task_9_1 {
    public static void main(String[] args) {
        System.out.println(Week.WEN);

        for (Week w : Week.values()) {
            System.out.print(w + " ");

            if (w == Week.FRI) {
                System.out.print("Ураа ");
            }

        }

        Week myDay = Week.valueOf("MON");
//        myDay.getNumber();
        System.out.println(myDay.getNumber());
    }
}