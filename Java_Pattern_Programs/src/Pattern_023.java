public class Pattern_023 {
    public static void main(String[] args) {
        // 23
        // E D C B A
        // E D C B
        // E D C
        // E D
        // E
        for (int i = 5; i >= 1; i--) {
            char j = 69;
            for (int a = i; a >= 1; a--) {
                System.out.print(j + " ");
                j--;
            }
            System.out.println();
        }
        System.out.println();
    }
}