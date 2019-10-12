public class Pattern_006 {
    public static void main(String[] args) {
        /*
         * 5 5 5 5 5
         * 4 4 4 4 4
         * 3 3 3 3 3
         * 2 2 2 2 2
         * 1 1 1 1 1
         * */
        for (int i = 0, digitToConsole = 5; i < 5; i++) {
            for (int a = 0; a < 5; a++) {
                System.out.print(digitToConsole + " ");
            }

            digitToConsole--;
            System.out.println();
        }
    }
}