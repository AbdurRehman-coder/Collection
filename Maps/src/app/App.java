package app;

import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class App {
    public static void main(String[] args) throws Exception {

        Map<String, String> mapValues = new HashMap<>();
        mapValues.put("name", " Abdur Rehman");
        mapValues.put("company", "AR TEchy");
        mapValues.put("address", "New York ");
        // Set<String> set = mapValues.keySet();

        // for(String s: set){
        // System.out.println(s + ":"+mapValues.get(s) );
        // }

        // Entry is inner interface of Map interface mean its is
        // nested interface...
        // entrySet is a method that store whole entry( Node )..
        Set<Map.Entry<String, String>> values = mapValues.entrySet();
        for (Entry<String, String> e : values) {
            System.out.println(e.getKey()+"... " + e.getValue());

    }

        // Map<String, String> map = new Hashtable<>();
        // map.put("name", "Abdur Rehman");
        // map.put("company", "AR TechStudio");
        // map.put("CEO", "Rehman");
        // Set<String> keys = map.keySet();
        // for(String key : keys ){
        //     System.out.println( map.get(key));         
        // };

        // Scanner s = new Scanner(System.in);
        // String SS;
        // System.out.println("enter your key:");
        // SS = s.nextLine();
        // System.out.println( SS +"   " + map.get(SS));

    }
}