package day6;
import java.util.*;
  public class clearlist{
  public static void main(String[] args) {
   ArrayList<String> c1= new ArrayList<String>();
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");
          System.out.println("Original array list: " + c1);
          c1.removeAll(c1);
          System.out.println("Array list after remove all elements \n "+c1);
          }
  }