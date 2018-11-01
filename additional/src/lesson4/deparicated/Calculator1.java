package lesson4.deparicated;

/**
 * Created by Rea1 on 16.10.2018.
 */
public class Calculator1 {
    private static double number1;
    private static double number2;
    private static double result;


    public static void main(String[] args) throws IllegalArgumentException {
       if (args.length > 3  ) throw  new IllegalArgumentException("Too much arguments");
       if (args.length < 3  ) throw new IllegalArgumentException("Too little arguments");

       try {
           number1 =  Double.parseDouble(args[0]);
           number2 =  Double.parseDouble(args[2]);
       }
       catch (IllegalArgumentException ex) {
           throw new IllegalArgumentException("Illegal argument");
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
               throw new IllegalArgumentException("Illegal math operation");
       }
        System.out.println(result);

    }

}
