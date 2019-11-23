public class Pattern_049 {
    public static void main(String[] args) {
        /*
        * 49
        * 9 9 9 9 9 9 9 9 9
        *   7 7 7 7 7 7 7
        *     5 5 5 5 5
        *       3 3 3
        *         1
        * 'height' value can be changed from 1 up to 5
        * */
        int height = 5;
        int space = 0;
        int digit = height * 2 - 1;
        int numberOfDigits = digit;

        for (int i = 0; i < height; i++) {
            for (int a = 0; a < space; a++) {
                System.out.print("  ");
            }

            space++;

            for (int b = 0; b < numberOfDigits; b++) {
                System.out.print(digit + " ");
            }

            digit -= 2;
            numberOfDigits -= 2;
            System.out.println();
        }
    }
}