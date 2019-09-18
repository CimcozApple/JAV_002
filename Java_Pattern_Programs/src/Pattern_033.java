public class Pattern_033 {
    public static void main(String[] args) {
        // 33
        // A B C D E
        //   A B C D
        //     A B C
        //       A B
        //         A
        System.out.println("----------33");
        char shq = 65;
        char aas = 69;
        for (int i = 1; i <= 5; i++) {
            for (int d = 1; d < i; d++) {
                System.out.print("  ");
            }

            for (char iu = shq; iu <= aas; iu++) {
                System.out.print(iu + " ");
            }
            aas--;
            System.out.println();
        }
        System.out.println();
        /*********************************************************************************/
        for (int i = 0, a = 70, b = 0; i <= 4; i++) {
            for (int y = 0; y < b; y++) {
                System.out.print("  ");
            }
            b++;

            for (int c = 65; c < a; c++) {
                System.out.print((char) c + " ");
            }
            a--;
            System.out.println();
        }
    }
}