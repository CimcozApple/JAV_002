public class Pattern_025 {
    public static void main(String[] args) {
        // 25
        //         1
        //       2 2
        //     3 3 3
        //   4 4 4 4
        // 5 5 5 5 5
        int m = 4;
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            for (int a = m; a >= 1; a--) {
                System.out.print("  ");
            }
            m--;

            for (int ab = 1; ab <= i; ab++) {
                System.out.print(n + " ");
            }
            n++;
            System.out.println();
        }
        System.out.println();
    }
}