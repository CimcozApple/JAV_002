public class Pattern_031 {
    public static void main(String[] args) {
        // 31
        // 1 2 3 4 5
        //   1 2 3 4
        //     1 2 3
        //       1 2
        //         1
        System.out.println("----------31");
        int add = 1;
        int lee = 5;
        for (int i = 1; i <= 5; i++) {
            for (int ags = 2; ags <= i; ags++) {
                System.out.print("  ");
            }

            for (int ass = add; ass <= lee; ass++) {
                System.out.print(ass + " ");
            }
            lee--;
            System.out.println();
        }
        System.out.println();
    }
}