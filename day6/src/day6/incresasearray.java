package day6;
import java.util.ArrayList;
  public class incresasearray {
  public static void main(String[] args) {
          ArrayList<String> list_string= new ArrayList<String>(3);
          list_string.add("Red");
          list_string.add("Yellow");
          list_string.add("Green");
          System.out.println("Original array list: " + list_string);
 
          list_string.ensureCapacity(6);
          list_string.add("White");
          list_string.add("Pink");
          list_string.add("Black");
          System.out.println("New array list: " + list_string);
   }
}
