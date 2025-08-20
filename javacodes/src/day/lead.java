package day;
import java.util.*;
public class lead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int maxRight = arr[n - 1];
        System.out.print("Leaders: " + maxRight + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                System.out.print(maxRight + " ");
            }
        }
        sc.close();
    }
}
