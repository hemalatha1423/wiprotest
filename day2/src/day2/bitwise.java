package day2;
import java.util.Scanner;
public class bitwise {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter first number: ");
       int a = sc.nextInt();
       System.out.print("Enter second number: ");
       int b = sc.nextInt();
       System.out.println("AND: " + (a & b));
       System.out.println("OR: " + (a | b));
       System.out.println("XOR: " + (a ^ b));
       sc.close();
   }
}
