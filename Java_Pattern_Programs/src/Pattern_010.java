public class Pattern_010 {
    public static void main(String[] args) {
        // pattern 10
        /*
         * *
         * **
         * ***
         * ****
         * *****
         * */
        int n = 5;
        for (int i = n; i >= 1; i--) { // кол. строк
            for (int a = i; a <= n; a++) { // кол. повторений
                System.out.print("*");
            }
            System.out.println();
        }
    }
}