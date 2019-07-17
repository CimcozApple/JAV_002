public class Pattern_027 {
    public static void main(String[] args) {
        // 27
        //         A
        //       B B
        //     C C C
        //   D D D D
        // E E E E E
        char ad = 65;
        char av = 65;
        int ag = 4;
        for (char i = 65; i <= 69; i++) {
            for (int ab = ag; ab >= 1; ab--) {
                System.out.print("  ");
            }
            ag--;

            for (char ac = ad; ac <= av; ac++) {
                System.out.print(av + " ");
            }
            System.out.println();
            av++;
        }
        System.out.println();
    }
}