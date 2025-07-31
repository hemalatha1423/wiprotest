package day6;
import java.util.*;
public class ReverseArrayList {
  public static void main(String[] args) {
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("Pink");
  list_Strings.add("Yellow");
  list_Strings.add("Blue");
  System.out.println("List before:\n" + list_Strings);  
  Collections.reverse(list_Strings);
  System.out.println("List after :\n" + list_Strings); 
  }
}