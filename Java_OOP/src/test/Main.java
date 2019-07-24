package test;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.awt.*;

public class Main {
    private static String aaa;
    private static String bbb;

    public static void main(String[] args) {
//        Aclass aclass = new Aclass("red", "apple");
//        System.out.println(aclass.getClass());
//
//        boolean isTrue = aclass.equals(aclass);
//        System.out.println(isTrue);

        aaa = "5";
        bbb = "10";
        System.out.println(abc(aaa, bbb));
    }


    public static Boolean abc(String value1, String value2) {
        if (value1 == null || value2.equals("10")) {
            return true;
        }
        return false;
    }
}