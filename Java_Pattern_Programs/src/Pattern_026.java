public class Pattern_026 {
    public static void main(String[] args) {
        // 26
        //         1
        //       1 2
        //     1 2 3
        //   1 2 3 4
        // 1 2 3 4 5
        for (int i = 1, spacesBeforeDigit = 4, startFromOneDigit = 1; i <= 5; i++) {
            for (int a = spacesBeforeDigit; a >= 1; a--) {
                System.out.print("  ");
            }
            spacesBeforeDigit--;

            for (int b = startFromOneDigit; b <= i; b++) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}