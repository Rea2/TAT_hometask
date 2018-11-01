package lesson5.charset;



import java.nio.charset.Charset;

/**Написать программу, определяющую, содержит ли строка символы, байто-вое представление которых в кодировках CP1251, CP866 и UTF-8 совпадают.
 * Created by Raik Yauheni on 24.10.2018.
 */
public class CharsetChecker {
    public static void main(String[] args) {

        Charset currentCharset = Charset.defaultCharset();

        System.out.println( currentCharset.toString());

        byte[] arrayCp1251 = args[0].getBytes(Charset.forName("CP1251"));
        byte[] arrayCp866 = args[0].getBytes(Charset.forName("CP866"));
        byte[] arrayUtf8 = args[0].getBytes(Charset.forName("utf8"));

        System.out.println(arrayCp866.length);

        for (int i = 0; i < arrayUtf8.length-1; i++) {
            System.out.println(arrayUtf8[i] + " " + arrayCp866[i] + " " + arrayCp1251[i]);
        }









    }
}
