public class Pattern_028 {
    public static void main(String[] args) {
        // 28
        //         A
        //       A B
        //     A B C
        //   A B C D
        // A B C D E
        char end = 68;
        char en = 65;
        for (char i = 65; i <= 69; i++) {
            for (char space = end; space >= 65; space--) {
                System.out.print("  ");
            }
            end--;

            for (char as = en; as <= i; as++) {
                System.out.print(as + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}