package lesson5.task3;

import java.math.BigDecimal;

/** Задача 3
 *   Условие:
 * Написать метод, определяющий площадь круга с радиусом X
 *
 */
public class Circle {

    /**  method is used only for testing  getRandomMultivaluedNumber(long n) */
    public static void main(String[] args) {
        /*case 1* input "0"*/
        System.out.print("0 -> ");
        printAreaOfCircle("0");

       /*case 2* illegal input "B"*/
        System.out.print("B -> ");
        printAreaOfCircle("b");

        /*case 3*  input "1"*/
        System.out.print("1 ->   ");
        printAreaOfCircle("1");

        /*case 4*  input "8"*/
        System.out.print("4 ->   ");
        printAreaOfCircle("4");
    }

    public static void printAreaOfCircle(String s) {

        BigDecimal radius;

        try {
            radius = new BigDecimal(s);

        } catch (NumberFormatException e) {
            System.out.println("It was entered illegal number. Please, input any decimal number");
            return;
        }
        if (radius.equals(BigDecimal.ZERO)) {
            System.out.println("It was entered zero. Please, input any other decimal number");
            return;
        }
        System.out.printf("%.3e",
                radius.multiply(radius)
                        .multiply(new BigDecimal(Math.PI)));
        System.out.println("");
    }
}
