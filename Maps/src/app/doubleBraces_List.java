package app;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class doubleBraces{
    public static void main(String[] args) {
        System.out.println("hello gamer oh no sorry i am app developer...");
        List<String> values = new ArrayList<String>(){
            /**
             *
             */
            private static final long serialVersionUID = 1L;

            {
        add("Game developer");
        add("Ethical Hacker");
        add("app developer:");
            }
        };
        // values.add(23);
        // values.add(89);
        // values.add(001);
        for(String  i: values){
            System.out.println("List = " + i);
        }
    }
}