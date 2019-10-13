public class Pattern_002 {
    public static void main(String [] args) {
        /*
         * 1
         * 1 1 1 1 1
         * 2 2 2 2 2
         * 3 3 3 3 3
         * 4 4 4 4 4
         * 5 5 5 5 5
         * */
        int countOfString = 5;
        int numbers = 1;

        // option 1
        for (int i = 0; i < countOfString; i++) {
            for (int a = 1; a <= countOfString; a++) {
                System.out.print(numbers + " ");
            }
            System.out.println();
            numbers++;
        }

        System.out.println("- - - - -");

        // option 2
        for (int i = 1; i <= countOfString; i++) {
            for (int a = 1; a <= countOfString; a++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}