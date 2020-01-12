package app;

import java.util.Comparator;

public class comp implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
    if(o2 % 10 > o1 % 10)

        return 1;  // return 1 mean swip the values
 
        return -1;  // it means that if above statement is not true than don't swip it.

    }

}
