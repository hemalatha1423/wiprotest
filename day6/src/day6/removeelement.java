package day6;
import java.util.*;
public class removeelement {
  public static void main(String[] args) {
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("Pink");
  list_Strings.add("Yellow");
  list_Strings.add("Blue");
  System.out.println(list_Strings);
  list_Strings.remove(1);
  System.out.println("list after removing element : \n"+list_Strings);
  }
}