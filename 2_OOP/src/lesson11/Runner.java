package lesson11;

public class Runner {
    public static void main(String[] args) {
        Calendar days = new Calendar();
        days.fillTheCalendar();
//        System.out.println(days);

        System.out.println("ALL DAYS");
        System.out.println(days.findAllHolidays());

        System.out.println();
        System.out.println("CHURCH DAYS");
        System.out.println(days.findAllChurchHolidays());



    }
}