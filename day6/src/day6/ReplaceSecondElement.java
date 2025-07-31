package day6;
import java.util.ArrayList;
  public class ReplaceSecondElement {
  public static void main(String[] args) {
          ArrayList<String> list_string= new ArrayList<String>(3);
          list_string.add("Red");
          list_string.add("Yellow");
          
          System.out.println("Original array list: " +list_string);
          String new_color = "White";
          list_string.set(1,new_color); 
          int num=list_string.size();
          System.out.println("Replace second element with 'White'."); 
          for(int i=0;i<num;i++)
          System.out.println(list_string.get(i));
          }
  }