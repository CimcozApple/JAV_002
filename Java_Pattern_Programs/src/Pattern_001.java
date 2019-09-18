public class Pattern_001 {
    public static void main(String [] args) {
        /*
         * pattern 1
         *
         * *****
         * *****
         * *****
         * *****
         * *****
         * */
        int n = 5;
        for (int i = 1; i <= n; i++) { // кол. строк
            for (int a = n; a >= 1; a--) { // кол. повторений
                System.out.print("*");
            }
            System.out.println();
        }
    }
}