package day6;
import java.util.*;
public class sublist {
  public static void main(String[] args) {
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("Pink");
  list_Strings.add("Yellow");
  list_Strings.add("Blue");
  System.out.println("original list:\n" + list_Strings);  
  List<String> sub_List = list_Strings.subList(0, 2);
  System.out.println("List of first three elements: " + sub_List); 
  }
}