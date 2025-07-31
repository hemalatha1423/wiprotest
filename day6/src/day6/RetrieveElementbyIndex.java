package day6;
import java.util.*;
public class RetrieveElementbyIndex {
  public static void main(String[] args) {
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("Pink");
  list_Strings.add("Yellow");
  list_Strings.add("Blue");
  System.out.println(list_Strings);
  String ele = list_Strings.get(0);
  System.out.println("First element: "+ele);
  ele = list_Strings.get(3);
  System.out.println("third element: "+ele);
  }
}