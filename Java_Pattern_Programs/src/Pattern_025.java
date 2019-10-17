public class Pattern_025 {
    public static void main(String[] args) {
        // 25
        //         1
        //       2 2
        //     3 3 3
        //   4 4 4 4
        // 5 5 5 5 5
        for (int i = 1, spacesBeforeDigit = 4, digit = 1; i <= 5; i++) {
            for (int a = spacesBeforeDigit; a >= 1; a--) {
                System.out.print("  ");
            }
            spacesBeforeDigit--;

            for (int ab = 1; ab <= i; ab++) {
                System.out.print(digit + " ");
            }
            digit++;
            System.out.println();
        }
    }
}