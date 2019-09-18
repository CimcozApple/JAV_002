public class Pattern_003 {
    public static void main(String [] args) {
        /*
         * pattern 3
         *
         * 1 2 3 4 5
         * 1 2 3 4 5
         * 1 2 3 4 5
         * 1 2 3 4 5
         * 1 2 3 4 5
         * */
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int a = 1; a <= num; a ++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}