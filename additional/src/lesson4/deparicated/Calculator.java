package lesson4.deparicated;

/**
 * Created by Rea1 on 16.10.2018.
 */
public class Calculator {
    private static double number1;
    private static double number2;
    private static double result;

    public static void main(String[] args) {
       if (args.length > 3  ) {
           System.out.println("Too much arguments");
           return;
       }
       if (args.length < 3  ) {
           System.out.println("Too little arguments");
           return;
       }
       try {
           number1 =  Double.parseDouble(args[0]);
           number2 =  Double.parseDouble(args[2]);
       }
       catch (IllegalArgumentException ex) {
           System.out.println("Illegal argument");
           return;
       }
       switch (args[1]) {
           case "-":
               result = number1 - number2;
               break;
           case "+":
               result = number1 + number2;
               break;
           case "/":
               result = number1 / number2;
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
