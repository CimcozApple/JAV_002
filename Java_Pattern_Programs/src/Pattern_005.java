public class Pattern_005 {
    public static void main(String[] args) {
        /*
         * pattern 5
         *
         * A B C D E
         * A B C D E
         * A B C D E
         * A B C D E
         * A B C D E
         * */
        char foo = 69;
        char fooEnd = 65;
        for (char i = fooEnd; i <= foo; i++) {
            for (char a = fooEnd; a <= foo; a++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}