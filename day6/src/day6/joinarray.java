package day6;
import java.util.*;
  public class joinarray{
  public static void main(String[] args) {
   ArrayList<String> c1= new ArrayList<String>();
          c1.add("Red");
          c1.add("yellow");
          c1.add("green");
          System.out.println("List of first array: " + c1);

          ArrayList<String> c2= new ArrayList<String>();
          c2.add("blue");
          c2.add("black");
          c2.add("white");
          c2.add("Pink");
          System.out.println("List of second array: " + c2);
          
          ArrayList<String> a = new ArrayList<String>();
          a.addAll(c1);
          a.addAll(c2);
          System.out.println("New array: " + a);

         
     }
}