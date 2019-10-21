public class Pattern_030 {
    public static void main(String[] args) {
        // 30
        // 5 5 5 5 5
        //   4 4 4 4
        //     3 3 3
        //       2 2
        //         1
        for (int i = 5; i >= 1; i--) {
            for (int ads = 4; ads > i - 1; ads--) {
                System.out.print("  ");
            }

            for (int afw = i; afw >= 1; afw--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}