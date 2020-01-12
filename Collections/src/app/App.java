package app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) 
     {
         String[] totalColor = {" MAGANTA ", " RED ", " WHITE ", " BLUE ", " CANTA "};
         List<String> list = new ArrayList<String>(); 
         for(String color: totalColor)
         {
             list.add(color);
         }

         String[] removeColor = {" RED ", " WHITE ", " BLUE "};
         List<String> removeList = new ArrayList<>();
         for(String color: removeColor)
        {
            removeList.add(color);
        }

        System.out.println("ArrayList befor remove colors: ");
        for(int count = 0; count < list.size(); count++)
        {
            System.out.printf(" %s " , list.get(count));
        }
        ColorContain(list, removeList);

        System.out.println("\n\n\n ArrayList after Colors Remove: ");
        try {
            for(String color: list)
            {
                System.out.println(" values  " + color);
            }
            
        } catch (Exception e) {
            System.out.println("exception: " + e);
        }
    


       
    }

    private static void ColorContain(Collection<String> collection1 , Collection<String> collection2) 
    {
        Iterator<String> iterator = collection1.iterator();
        while(iterator.hasNext())
        {
            if(collection2.contains(iterator.next()));
            {
                iterator.remove();
            }
        }
       
    }

   
}