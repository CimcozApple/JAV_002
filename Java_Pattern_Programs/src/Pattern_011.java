public class Pattern_011 {
    public static void main(String[] args) {
        /*
         * 1
         * 22
         * 333
         * 4444
         * 55555
         * */
        int foo2 = 1;
        int fooE2 = 5;
        for (int i = foo2; i <= fooE2; i++) {
            for (int a = i; a <= (i + i) - 1; a++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}