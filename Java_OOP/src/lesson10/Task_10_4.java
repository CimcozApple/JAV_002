package lesson10;

public class Task_10_4 {
    public static void main(String[] args) throws InterruptedException {
        String str = "S0";
//        StringBuilder str = new StringBuilder("Hello");
        for (int i = 1; i < 100_000; i++) {
            str += "world" + i;
//            str.append("World" + i);
            Thread.sleep(1000);
        }
        System.out.println(str);
    }
}

/*
* text1.doc
* text2.doc
* text3.doc
* text4.doc
*
* text*.* // знак бесконечности - *, знак ? - 1
*
* */