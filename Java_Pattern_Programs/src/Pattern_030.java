public class Pattern_030 {
    public static void main(String[] args) {
        // 30
        // 5 5 5 5 5
        //   4 4 4 4
        //     3 3 3
        //       2 2
        //         1
        for (int i = 5; i >= 1; i--) {
            for (int a = 4; a > i - 1; a--) {
                System.out.print("  ");
            }

            for (int b = i; b >= 1; b--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}