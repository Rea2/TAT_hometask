package lesson4.helloname;

/**
 * This class provides printing input arguments (for method "main") in reverse order.
 *
 */
public class HelloName {
    
    public static void main(String... args) {
        if (args.length == 0) return;
        else  {
            StringBuilder result = new StringBuilder("Hello, ");
            for(int i = 0; i < args.length; i++) {
                result.append(args[i]);
                if (i < args.length-1) {
                   result.append(" ");
               }
            }
        System.out.println(result);
        }
    }
}
