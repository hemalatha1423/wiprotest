package day6;
import java.util.*;
public class trim {
  public static void main(String[] args) {
  ArrayList<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("Pink");
  list_Strings.add("Yellow");
  list_Strings.add("Blue");
  System.out.println("Original array list: " +list_Strings );
  System.out.println("Let trim to size the above array: ");
  list_Strings.trimToSize();
  System.out.println(list_Strings);
 }
}