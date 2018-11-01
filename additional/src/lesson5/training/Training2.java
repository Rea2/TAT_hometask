package lesson5.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Raik Yauheni on 25.10.2018.
 */
public class Training2 {

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        char c = ' ';
//        System.out.println("Input \"q\" if you want to stop the process");
//        do {
//            c = (char) br.read();
//            System.out.print(c);
//
//        } while (c != 'q');
//    }

//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    String str;
//        System.out.println("Input \"exit\" if you want to stop the proccess");
//        do {
//        str = br.readLine();
//        System.out.println(str);
//        } while (!str.equalsIgnoreCase("exit"));

        Scanner sc = new Scanner(System.in);
        String str;

        while (!(str = sc.nextLine()).equalsIgnoreCase("exit")) {
            System.out.println(str);
        }

}


}
