package lesson4.SimpleCalculator;

/**
 * Created by Raik Yauheni on 16.10.2018.
 */
public class SimpleCalculator {
    private static double number1;
    private static double number2;
    private static double result;

    public static void main(String[] args) {

/* cheking number of arguments */
       if (args.length > 3  ) {
           System.out.println("Too much arguments");
           return;
       }
       if (args.length < 3  ) {
           System.out.println("Too little arguments");
           return;
       }
/* validate dividend and divider */
       try {
           number1 =  Double.parseDouble(args[0]);
           number2 =  Double.parseDouble(args[2]);
       }
       catch (IllegalArgumentException ex) {
           System.out.println("Illegal argument");
           return;
       }
/* math operations  */
       switch (args[1]) {
           case "-":
               result = number1 - number2;
               break;
           case "+":
               result = number1 + number2;
               break;
           case "/":
               if (number2 != 0  )result = number1 / number2;      // division and checking is divider isn't equal zero
               else System.out.println("Error: Devider is zero");
               break;
           case "x":
               result = number1 * number2;
               break;
           default:
               System.out.println("Illegal math operation");
               return;
       }
        System.out.println(result);
    }
}
