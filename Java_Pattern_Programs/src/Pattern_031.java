public class Pattern_031 {
    public static void main(String[] args) {
        // 31
        // 1 2 3 4 5
        //   1 2 3 4
        //     1 2 3
        //       1 2
        //         1
        for (int i = 1, firstDigit = 1, lastDigit = 5; i <= 5; i++) {
            for (int a = 2; a <= i; a++) {
                System.out.print("  ");
            }

            for (int b = firstDigit; b <= lastDigit; b++) {
                System.out.print(b + " ");
            }
            lastDigit--;
            System.out.println();
        }
    }
}