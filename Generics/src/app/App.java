package app;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;



public class App {
    public static void main(String[] args) throws Exception {
        Collection<Integer> coll = new ArrayList<>();
        coll.add(1003);
        coll.add(2007);
        List<Integer> values = new ArrayList<>();
        values.add(344);
        values.add(229);
        values.add(110);
        values.add(1, 575);
        values.addAll(coll);
    System.out.println(values);
   
    // Comparator<Integer> comparator = (o1, o2) -> {  // this is anonymous class
    //             if(o2 %10 > o1%10)                 // for that we use Lambda Expression: 
    //             return 1;
    //             return -1;
    //         };
     Collections.sort(values,(o1,o2) ->
     {
         return o2 % 10 > o1 % 10 ? 1 : -1;
     });
       values.forEach(System.out::println);


    

    
    }
}
