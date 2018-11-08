package lesson5.task4;

import java.math.BigDecimal;
import java.nio.charset.Charset;

/** Задача 4
 *   Условие:
 * Написать программу, определяющую, образуют ли цифры некоторого числа строго возрастающую последовательность.
 * Например: 123 – образуют, 212 – не образуют.
 *
 */
public class SequenceOfNumbers {
    /**  method is used only for testing  isIncreasingSequence(String n) */

    public static void main(String[] args) {
        System.out.println(isIncreasingSequence("12345679"));
    }
    /**
     * Returns  boolean <b>true</b>, if the parameter is increasing sequence of numbers, otherwise returns b>false</b>.
     * @param n number
     *
     */
    public static boolean isIncreasingSequence(String n) throws IllegalArgumentException {
        String number = n.trim();
          try {
             Long.parseLong(number);
             if (Long.parseLong(number) < 0) {
             throw  new IllegalArgumentException(number + " is negative number. Please, input positive number");
             }
         } catch (NumberFormatException e) {
             throw  new IllegalArgumentException(number +"is not a number");
         }

        if (number.length()>9 || number.length()<2) return false;

        char[] array =  number.toCharArray();

        for (int i = 0; i <array.length-1 ; i++) {
         if (Character.compare(array[i], array[i+1]) <  0) continue;
         else return false;
        }
        return true;
    }
}
