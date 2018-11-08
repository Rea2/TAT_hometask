package lesson5.training;



import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;

/**
 * Created by Raik Yauheni on 23.10.2018.
 */


public class Methods {
    public static void main(String[] args) {
 /**  testing  getNumberOfPagesForNews
    getNumberOfPagesForNews(0);
    getNumberOfPagesForNews(1);
    getNumberOfPagesForNews(9);
    getNumberOfPagesForNews(10);
    getNumberOfPagesForNews(11);
    getNumberOfPagesForNews(19);
    getNumberOfPagesForNews(20);
    getNumberOfPagesForNews(21);
    getNumberOfPagesForNews(29);
*/

        for (int i = 0 ; i <1; i++) {
//
            //calcAreaOfCircle("1453589749687568975690786940879356870948884569788800");
            getRandomMultivaluedNumber(1000000);

        }


    }

    /** Задача 1
    *   Условие:
    *Новости выводятся по 10 на страницу. Написать метод, определяющий коли-чество страниц для вывода N новостей.
    *   Решение (1 метод):
    */
    public static void getNumberOfPagesForNews(long n ) {
         final int NUMBER_OF_NEWS_PER_PAGE = 10;
         long result;

         if (n==0) {
             System.out.println("No news (zero news), pages are not required");
             return;
         } else  if (n%10 == 0) {
             result = n / NUMBER_OF_NEWS_PER_PAGE;
         } else {
             result = (n / NUMBER_OF_NEWS_PER_PAGE)+ 1;
         }

        if (result == 1)  System.out.println(result + " page is required for posting news");
        else System.out.println(result + " pages are required for posting news");

    }

    /** Задача 2
     *   Условие:
     *Написать метод, возвращающий N-значное целое случайное число.
     *   Решение (1 метод):
     */
    public static void getRandomMultivaluedNumber(long n) {
        if (n == 0) {
            System.err.println("It was entered zero. Please, input an integer greater than zero");
            return;
        }
        StringBuilder result = new StringBuilder();
        if(Math.random() > 0.5  ) result.append("-");

        for (int i = 1; i <= n; i++) {
            if (i == 1) result.append( (int) ((Math.random() * 9)+1) );
            else result.append((int)(Math.random()* 10));
        }
        System.out.println(result);
    }

    /** Задача 3
     *   Условие:
     * Написать метод, определяющий площадь круга с радиусом X
     *   Решение (1 метод):
     */

    public static void calcAreaOfCircle(String s) {

        BigDecimal radidus;

        try {
            radidus = new BigDecimal(s);

        } catch (NumberFormatException e) {
            System.err.println("It was entered illegal number. Please, input any decimal number");
            return;
        }
        if (radidus.equals(BigDecimal.ZERO)) {
            System.err.println("It was entered zero. Please, input any other decimal number");
            return;
        }
        System.out.printf("%.3e",
                        radidus.multiply(radidus)
                               .multiply(new BigDecimal(Math.PI)));
    }


}
