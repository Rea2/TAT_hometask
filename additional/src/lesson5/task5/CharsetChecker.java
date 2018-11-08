package lesson5.task5;

import java.nio.charset.Charset;

/**
 * Задача 4
 * Условие:
 * Написать программу, определяющую, содержит ли строка символы, байтовое представление которых в кодировках CP1251, CP866 и UTF-8 совпадают.
 *
 */

public class CharsetChecker {
    /**
     * gets argument and run
     * @param args bunch of string for checking
     *
     */
    public static void main(String[] args) {
        if (args.length == 0) System.out.println("There are not any arguments. Please,run the app again with new arguments. They have to contain one or more characters");
        boolean result = false;
        for(String s : args) {
            if (isConsistCharacterSamePresentationIntoDifferentEncoding(s)) {
            result = true;
            break;
            }
        }
        String contain = (result == true ? "contains" : "doesn't contain");

        System.out.println("The string " +contain + " character(s), which has(have) the same presentation in charstest \"CP1251\", \"CP866\", \"utf8\" ");


    }
    /**
     * check has  the string  the character, which has the same presentation in different charsets
     * ("CP1251", "CP866", "utf8" ), prints the first character, which has the same presentation.
     * @param s string for checking
     * @return  <b>true</b> if the string consists at least a character with the same presentation,
     *          <b>false</b> if there are not any the such characters.
     *
     */

    public static boolean isConsistCharacterSamePresentationIntoDifferentEncoding(String s){
    byte[] arrayCp1251 = s.getBytes(Charset.forName("CP1251"));
    byte[] arrayCp866 = s.getBytes(Charset.forName("CP866"));
    byte[] arrayUtf8 = s.getBytes(Charset.forName("utf8"));

    for (int i = 0; i < s.length()-1; i++) {
        if (arrayCp1251[i] == arrayCp866[i] && arrayCp1251[i] == arrayUtf8 [i]) {
            System.out.println("this char: " +
                    s.toCharArray()[i] +" -> " + " | CP1251: " + arrayCp1251[i]+ " | UTF8: " + arrayUtf8[i] + " | CP866: " + arrayCp866[i]);
            return true;
        }
    }
    return false;
    }
}
