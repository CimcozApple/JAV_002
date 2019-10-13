public class Pattern_020 {
    public static void main(String[] args) {
        // 20
        // 5 5 5 5 5
        // 4 4 4 4
        // 3 3 3
        // 2 2
        // 1
        for (int i = 5; i >= 1; i--) {
            for (int a = i; a >= 1; a--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}