package assessment;
import java.util.Scanner;

public class lastdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input of two non-negative integers
        System.out.print("Enter the first non-negative integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second non-negative integer: ");
        int num2 = sc.nextInt();

        if (num1 < 0 || num2 < 0) {
            System.out.println("Only non-negative integers are allowed.");
        } else {
            // Check if last digits are same
            boolean result = (num1 % 10) == (num2 % 10);
            System.out.println(result);
        }

        sc.close();
    }
}
