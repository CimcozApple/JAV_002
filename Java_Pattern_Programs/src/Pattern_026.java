public class Pattern_026 {
    public static void main(String[] args) {
        // 26
        //         1
        //       1 2
        //     1 2 3
        //   1 2 3 4
        // 1 2 3 4 5
        int p = 4;
        for (int i = 1; i <= 5; i++) {
            int r = 1;

            for (int o = p; o >= 1; o--) {
                System.out.print("  ");
            }
            p--;

            for (int q = r; q <= i; q++) {
                System.out.print(q + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}