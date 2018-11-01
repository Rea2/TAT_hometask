package lesson4.deparicated;

/**
 * Created by Raik Yauheni on 18.10.2018.
 */
public class QuadraticEquationSolver_old {
    private static double a;
    private static double b;
    private static double c;

    public static void main(String[] args) {
        if (validateArgs(args) == true) {
        System.out.print("Soultions: ");
        if (calcDiscriminant() < 0) {
            System.out.println("D<0, there aren't any solutions");
        } else if (calcDiscriminant() == 0 ) {
            System.out.println("D=0, x= " + (-1)*b /2 /a);
        }
        else {
            System.out.println("D>0, x1=" + (((-1)*b + Math.sqrt(calcDiscriminant())) /2 /a) +
                    " x2=" + (((-1)*b - Math.sqrt(calcDiscriminant())) /2 /a  ));
        }
    }
}

    private static boolean validateArgs (String[] args) {
        if (args.length > 3) {
            System.out.println("Too much arguments");
            return false;
        }

        if (args.length < 3) {
            System.out.println("Too little arguments");
            return false;
        }

        try {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            c = Double.parseDouble(args[2]);
            return true;
        } catch (IllegalArgumentException ex) {
            System.out.println("Illegal arguments");
            return false;
        }
    }
    private static double calcDiscriminant(){
        return  b*b  - 4*a*c;
    }

}
