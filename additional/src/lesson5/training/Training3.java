package lesson5.training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Created by Raik Yauheni on 25.10.2018.
 */
public class Training3 {
    private static List<String> set = new ArrayList<>();
    public static void main(String[] args) {
        set.add("one");
        set.add("two");

        Iterator<String> it2 = set.iterator();

        set.add("tree");

//        Iterator<String> it3 = set.iterator();

        for (String s: set) {
            System.out.println(s);

        }
        while (it2.hasNext()) {
            System.out.print(it2.next()+ " ");
        }
        System.out.println("");

//        while (it3.hasNext()) {
//            System.out.print(it3.next()+ " ");
//        }
    }
}
