public class Pattern_012 {
    public static void main(String[] args) {
        /*
         * 1
         * 12
         * 123
         * 1234
         * 12345
         * */
        int foo3 = 1;
        int fooE3 = 5;
        for (int i = foo3; i <= fooE3; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}