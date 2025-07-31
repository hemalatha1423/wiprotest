package day6;
import java.util.ArrayList;
  public class elementposition {
  public static void main(String[] args) {
          ArrayList<String> list_string= new ArrayList<String>(3);
          list_string.add("Red");
          list_string.add("Yellow");
          list_string.add("Green");
          list_string.add("Blue");
          System.out.println("\nOriginal array list: " + list_string);
          System.out.println("\nPrint using index of an element: ");
          int no_of_elements = list_string.size();
          for (int index = 0; index < no_of_elements; index++)
           System.out.println(list_string.get(index));
  }
  }
          
          