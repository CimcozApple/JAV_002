public class Pattern_014 {
    public static void main(String[] args) {
        // 14
        // A
        // A B
        // A B C
        // A B C D
        // A B C D E
        for (char i = 65; i <= 70; i++) {
            for (char k = 65; k < i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}