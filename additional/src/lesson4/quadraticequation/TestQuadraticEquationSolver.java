package lesson4.quadraticequation;



/**
 * Created by Raik Yauheni on 20.10.2018.
 */
public class TestQuadraticEquationSolver {
    private final static String TEXT_NO_SOLUTIONS = "The equation has no solutions";
    private final static String ILLEGAL_ARGUMENTS = "Illegal arguments";

    public static void main(String[] args) {

/**
 * Performing TestCases for full quadratic equation:
 * 1. D>0 (D -discriminant).
 */
        performTestCase("1", "3", "-4");
        System.out.println("Expected output: D>0, x1=1 x2=-4");


        performTestCase("-2", "-1", "15");
        System.out.println("Expected output: D>0, x1=3 x2 =2.5");

/**
 * 2. D=0.
 */
        performTestCase("1", "6", "9");
        System.out.println("Expected output: D=0, x =-3");

        performTestCase("9", "30", "25");
        System.out.println("Expected output: D=0, x = -1.66");

/**
 * 3. D<0.
 */
        performTestCase("2", "4", "7" );
        System.out.println("Expected output: " + TEXT_NO_SOLUTIONS);

/**
 * 4. Incorrect input:
 *   4.1 Illegal arguments
 */
        performTestCase("x", "4", "7");
        System.out.println("Expected output:  "+ ILLEGAL_ARGUMENTS);

        performTestCase("2", "s", "7");
        System.out.println("Expected output:  "+ ILLEGAL_ARGUMENTS);

        performTestCase("2", "4", "d");
        System.out.println("Expected output:  "+ ILLEGAL_ARGUMENTS);

        performTestCase("2:", "7i", "r");
        System.out.println("Expected output:  "+ ILLEGAL_ARGUMENTS);

/**
 *    4.1 Illegal number of arguments
 */
        performTestCase("1", "3");
        System.out.println("Expected output: Too little arguments");

        performTestCase("1", "3", "-4", "1", "-4", "-4");
        System.out.println("Expected output: Too much arguments");

/**
 * 2. Performing TestCases for incomplete Quadratic Equation:
 *
 */
        performTestCase("0", "5", "3"); // test case a=0; b!=0; c!=0;
        System.out.println("Expected output 1:  x=-0.6");

        performTestCase("1", "0", "9"); // test case  a!=0; b=0; c!=0;  ax2 <= 0
        System.out.println("Expected output 2: " + TEXT_NO_SOLUTIONS);

        performTestCase("1", "0", "-9"); // test case  a!=0; b=0; c!=0;  ax2 > 0
        System.out.println("Expected output 3: x1=3, x2=-3");

        performTestCase("3", "-6", "0"); // test case  a!=0; b!=0; c=0;
        System.out.println("Expected output 4: x1=0 x2=2");

        performTestCase("0", "0", "9"); // test case  a=0; b=0; c!=0;
        System.out.println("Expected output 5: " + TEXT_NO_SOLUTIONS);

        performTestCase("9", "0", "0"); // test case  a!=0; b=0; c=0;
        System.out.println("Expected output 6: x=0");

        performTestCase("0", "5", "0"); // a=0; b!=0; c=0;
        System.out.println("Expected output 7: x=0");

        performTestCase("0", "0", "0"); // test case  a=0; b=0; c=0;
        System.out.println("Expected output 8: The solution is any real number");
    }

    private static void performTestCase(String...args){
        System.out.println("------------------------");
        QuadraticEquationSolver.main(args);
    }
}
