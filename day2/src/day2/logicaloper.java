package day2;
import java.util.Scanner;
public class logicaloper {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter first boolean (true/false): ");
       boolean a = sc.nextBoolean();
       System.out.print("Enter second boolean (true/false): ");
       boolean b = sc.nextBoolean();
       System.out.println("AND: " + (a && b));
       System.out.println("OR: " + (a || b));
       System.out.println("NOT x: " + (!a));
       sc.close();
   }
}