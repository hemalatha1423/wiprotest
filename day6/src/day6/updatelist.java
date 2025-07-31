package day6;
import java.util.*;
public class updatelist {
  public static void main(String[] args) {
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("Pink");
  list_Strings.add("Yellow");
  list_Strings.add("Blue");
  System.out.println(list_Strings);
  list_Strings.set(1,"purple");
  System.out.println(list_Strings);
  }
}