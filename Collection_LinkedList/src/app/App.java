package app;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) throws Exception {
    String[] color1 = {" WHITE "," BLUE "," YELLOW "," BROWN "," GOLD "," DARK_BLUE "};
    List<String> list1 = new ArrayList<>();
    for(String color: color1 )
    {
        list1.add(color);
    }
    String[] color2 = {" RED ", " FULLWHITE ", " GREEN ", " GOLD " };
    List<String> list2 = new ArrayList<>();
    for(String color: color2)
    {
        list2.add(color);
    }
     printList(list1);
     list1.addAll(list2);
     list2 = null;

     System.out.println("\nlist2 merge into the list1\n\n");
     printList(list1);
    
    
    System.out.println("All Elements in LowerCase\n\n: ");
    converToUpperCase(list1);
     printList(list1);
    
     System.out.println("After removing some element from List: ");
     removeItem(list1, 2 , 5);
     printList(list1);

     System.out.println("\n\nList Elements in Reverse form: ");
     printReverseList(list1);
     
    
    }

    public static void printList(List<String> list)
     { 
         for(String colorss: list)
         {
             System.out.print(colorss);
         }
     }
     public static void converToUpperCase(List<String> list)
     {
         ListIterator<String> iterator = list.listIterator();
         while(iterator.hasNext())
         {
             String color = iterator.next();
             iterator.set(color.toLowerCase());
         }

     }
     public static void removeItem(List<String> list,int start, int end)
     {
        list.subList(start, end).clear();
        System.out.println("clear elements");
     }
     public static void printReverseList(List<String> list)
     {
         ListIterator<String> iterator = list.listIterator(list.size());
         while(iterator.hasPrevious())
         {
             String color = iterator.previous();
              System.out.print(color + " ");
         }

     }
}