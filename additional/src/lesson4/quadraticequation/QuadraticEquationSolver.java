package lesson4.quadraticequation;

/**
 * The {@code  QuadraticEquationSolver}  18.10.2018
 * This class solves quadratic equation such a*x^2 + b*x + c  = 0. It can be both types, either  full
 * quadratic equation or incomplete quadratic  equation (one or more parameters  equal zero ).
 * <p>Input values: three real numbers. If input values have incorrect numbers of arguments or invalid number
 * the software will print appropriate message: "Too much arguments",  "Too much arguments" or "Illegal arguments".
 * <p>Output results is printed to the console. If the solution consists of real numbers,
 * they will be printed in the console. Otherwise,  the  message either  "The equation has no solutions",
 * or "Solving is any real number"  will be printed.
 *
 * @author My_Name
 * @version  1.0.
 */
public class QuadraticEquationSolver {
    private final static String TEXT_NO_SOLUTIONS = "The equation has no solutions";
    private final static String ILLEGAL_ARGUMENTS = "Illegal arguments";

    /**  a, b, c -   parameters of the quadratic equation  a*x^2 + b*x + c  = 0 */
    private static double a;
    private static double b;
    private static double c;

    /**
     * Receive input values of the program and call  others private methods for getting results.
     *
     * @param args
     *
     * Array from input values
     */
    public static void main(String... args) {
        try {
            validateArgs(args);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getLocalizedMessage());;
            return;
        }

        if (a!=0 && b!=0 && c!=0) {
            solveFullEquation();
        } else solveIncompleteEquation();
    }

    /**
    * Solve the incomplete quadratic equation, print results to the console
    */
    private static void solveIncompleteEquation() {
        System.out.print("Incomplete equation: ");
        if(a==0 && b==0 && c==0) {
            System.out.println("Solving is any real number");
        } else if((c==0)&& (a==0 || b==0)) {
            System.out.println("x=0");
        } else if (a==0 && b==0) {
            System.out.println(TEXT_NO_SOLUTIONS);
        } else if (a==0) {
            System.out.println((-1) * c / b);
        } else if (b==0 ) {

            if(Double.isNaN(Math.sqrt((-1*(c*a))))) {
                System.out.println(TEXT_NO_SOLUTIONS);
            } else {
                System.out.println("x1=" + Math.sqrt((-1*(c*a))) + " x2=" +(-1)*Math.sqrt((-1*(c*a))));
            }
        } else if (c==0) System.out.println("x1=0 x2=" + ((-1)*b/a));
        else System.out.println("Error");
    }

    /**
     * Solve the full quadratic equation, print results to the console
     */
    private static void solveFullEquation() {
        System.out.print("Soultion: ");
        if (calcDiscriminant() < 0) {
            System.out.println("D<0, "+ TEXT_NO_SOLUTIONS);
        } else if (calcDiscriminant() == 0 ) {
            System.out.println("D=0, x= " + (-1)*b /2 /a);
        }
        else {
            System.out.println("D>0, x1=" + (((-1)*b + Math.sqrt(calcDiscriminant())) /2 /a) +
                    " x2=" + (((-1)*b - Math.sqrt(calcDiscriminant())) /2 /a  ));
        }
    }

    /**
     * parse input parameters into double types. Print message into console if the parameters are illegal.
     *
     * @param args
     */
    private static void validateArgs (String[] args) throws IllegalArgumentException {

        if (args.length > 3) {
            throw new IllegalArgumentException("Too much arguments");
        }

        if (args.length < 3) {
            throw new IllegalArgumentException("Too little arguments");
        }

        try {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            c = Double.parseDouble(args[2]);
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException (ILLEGAL_ARGUMENTS);
        }
    }

    /**
     * computes the discriminant of the quadratic equation
     *
     * @return  discriminant of the full quadratic equation.
     */
    private static double calcDiscriminant(){
        return  b*b  - 4*a*c;
    }

}
