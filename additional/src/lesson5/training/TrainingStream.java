package lesson5.training;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;

import java.io.*;
import java.util.*;

/**
 * Created by Raik Yauheni on 25.10.2018.
 */
public class TrainingStream {
    public static void main(String[] args) throws IOException {
        File file = new File("e:\\Java\\EPAM Training\\tat21_hometask\\additional\\src\\lesson5\\readme.info" );
        Map<Integer, String> map = new HashMap<>();
        FileReader fr;
        try {
             fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File didn't found");
            return;
        }
        BufferedReader br = new BufferedReader(fr);

        String str;
        int keyId = 0;
        try {
            while ((str = br.readLine()) != null){
               map.put(++keyId,str);
            }
        } catch (IOException e) {
            System.out.println("Error. Can't read the file");
        }

        TreeMap<Integer,String> sortMap = new TreeMap<Integer,String>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        }) {
        };
        sortMap.putAll(map);


        for(Map.Entry<Integer, String> entry: sortMap.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        File fileResult = new File("e:\\Java\\EPAM Training\\tat21_hometask\\additional\\src\\lesson5\\readme2.info");
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        fileWriter = new FileWriter(fileResult);
        bufferedWriter = new BufferedWriter(fileWriter);

        for (Map.Entry<Integer,String> entry: sortMap.entrySet()) {
            try {
                bufferedWriter.write(entry.getKey() + "->" + entry.getValue()+ "\n");


            } catch (IOException e) {
                System.out.println("Error during writing in the file ");
            };
        }
        bufferedWriter.close();
        br.close();






    }
}
