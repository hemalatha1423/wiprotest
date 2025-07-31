package day6;
import java.util.*;
public class searchelement {
  public static void main(String[] args) {
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("Pink");
  list_Strings.add("Yellow");
  list_Strings.add("Blue");
  if (list_Strings.contains("Blue")) {
	    System.out.println("Found the element");
	    } 
  else {
	    System.out.println("There is no such element");
	    }
  
  }
}