package day2;
import java.util.Scanner;
public class swapwithouttemp {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter 1st number: ");
       int a = sc.nextInt();
       System.out.print("Enter 2nd number: ");
       int b = sc.nextInt();
       a = a + b;
       b = a - b;
       a = a - b;
       System.out.println("After swap: a = " + a + ", b = " + b);
       sc.close();
   }
}