public class Pattern_021 {
    public static void main(String[] args) {
        // 21
        // 5 4 3 2 1
        // 5 4 3 2
        // 5 4 3
        // 5 4
        // 5
        for (int i = 5; i >= 1; i--) {
            for (int a = i, fiveDigit = 5; a >= 1; a--) {
                System.out.print(fiveDigit + " ");
                fiveDigit--;
            }
            System.out.println();
        }
    }
}