package lesson5.task2;

/**
*  Задача 2
*  Условие:
* Написать метод, возвращающий N-значное целое случайное число.
*
*
*/
public class PrintRandomNumber {

    /**  method is used only for testing  getRandomMultivaluedNumber(long n) */
    public static void main(String[] args) {
        /*case 1* input 0*/
        System.out.print("0 -> ");
        getRandomMultivaluedNumber(0);

        /*case 2* input 1*/
        System.out.print("1 -> ");
        getRandomMultivaluedNumber(1);

        /*case 3* input 9*/
        System.out.print("9 -> ");
        getRandomMultivaluedNumber(9);

        /*case 4* input 10000000*/
        System.out.print("10000000 -> ");
        getRandomMultivaluedNumber(10000000);
    }

    /**
     * Generates and prints into console random  n digits number(either positive or negative).
     * @param n number of digits for random number. There is not any restrictions how much digits it can include.
     *  If you input parameter more than 10000000 you'll might get {@code OutOfMemoryError}
     */
    public static void getRandomMultivaluedNumber(long n) {
        if (n == 0) {
            System.out.println("It was entered zero. Please, input an integer greater than zero");
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
}

