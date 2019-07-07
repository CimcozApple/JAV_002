package lesson12;

public class Task_12_2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        double d = 0;


//        d = foo(x, y); // нужно обработать

        try {
            d = foo(x, y);
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            ae.getMessage();
            d = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(d);
    }

    private static double foo(int x, int y) throws Exception {
        if (y == 0) {
//            throw new ArithmeticException();
            throw new Exception();
        }
        return x / y;
    }
}


//    private static double foo(int x, int y) throws Exception {
//        if (y == 0) {
//            try {
//                throw new Exception("Деление на ноль");
//            } catch (Exception e) {
//                throw new RuntimeException("Деление на ноль")
//            }
//        }
//        return x / y;
//    }
//}