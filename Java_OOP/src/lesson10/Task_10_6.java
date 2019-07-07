package lesson10;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_10_6 {
    public static void main(String args[]) {

        String text = "^AA^*^AA^ ^bb^1^bb^ By default, SB Emulation. ^BB^*^BB^ - tutorial abbyy.^CC^*^CC^ ^DD^*^DD^";

        String[] res = text.split("\\s*(\\s|,|!|\\.)\\s*");
        System.out.println(Arrays.toString(res));
        int firstFound = 0;
        for (int i = 0; i < res.length; i++) {
            if (checkWithRegExp((res[i]))) {
                if (firstFound == 0) {
                    firstFound = 1;
                    System.out.println("We found next words: ");
                }
                System.out.println(res[i]);
            }
        }
    }

    public static boolean checkWithRegExp(String word) {
        Pattern p = Pattern.compile("\\^[A-Z]+\\^\\*\\^[A-Z]+\\^");
        Matcher m = p.matcher(word);
        return m.matches();
    }
}