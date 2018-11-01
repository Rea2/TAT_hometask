package lesson4.commandlineparams;

/**
 * Created by Raik Yauheni on 20.10.2018.
 */
public class TestCommandLineParams {
    private static  String[] testArgs;
    
    public static void main(String[] args) {
        testArgs = new String[0];
        CommandLineParams.main(testArgs);
        
        testArgs = new String[] {"first", "second"} ;
        CommandLineParams.main(testArgs);

        testArgs = new String[] {"first", "second", "third", "fourth", "fifth"} ;
        CommandLineParams.main(testArgs);
        
        
        
    }
}
