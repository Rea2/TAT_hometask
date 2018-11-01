package lesson4.SimpleCalculator;



/**
 * Created by Raik Yauheni on 16.10.2018.
 */
public class TestSimpleCalculator {
    public static void main(String[] args) {
        String[] firstArg = {"0", "1", "-5000", "2", "23t", "15" };
        String[] secondArg = {"+", "-", "x", "/", " +-"};
        for(String secondArgument : secondArg) {
            for (int i = 0; i < firstArg.length; i++ ) {
                String[] testArray = {firstArg[i], secondArgument, firstArg[firstArg.length - 1 - i]};
                System.out.print(firstArg[i]+ " " + secondArgument + " " + firstArg[firstArg.length - 1 - i] + " = " );
                SimpleCalculator.main(testArray);
            }
        }
    }


}
