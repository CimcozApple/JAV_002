public class Pattern_008 {
    public static void main(String [] args) {
        /*
         * pattern 8
         *
         * E E E E E
         * D D D D D
         * C C C C C
         * B B B B B
         * A A A A A
         * */
        char foo4 = 65;
        char fooE4 = 73;
        for (char i = fooE4; i >= foo4; i--) {
            for (char a = foo4; a <= fooE4; a++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}