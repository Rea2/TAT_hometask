package lesson4.commandlineparams;

/**
 * Created by Raik Yauheni on 16.10.2018.
 */
public class CommandLineParams {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + " = " + args[args.length -1 - i]);
        }
    }
}

