public class Pattern_032 {
    public static void main(String[] args) {
        // 32
        // E E E E E
        //   D D D D
        //     C C C
        //       B B
        //         A
        System.out.println("----------32");
        char hyt = 65;
        char dse = 69;
        for (int i = 1; i <= 5; i++) {
            for (int d = 1; d < i; d++) {
                System.out.print("  ");
            }

            for (char gh = 69; gh >= hyt; gh--) {
                System.out.print(dse + " ");
            }
            hyt++;
            dse--;
            System.out.println();
        }
        System.out.println();
    }
}