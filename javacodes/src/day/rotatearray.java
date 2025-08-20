package day;
import java.util.*;
public class rotatearray {
    static void reverse(int[] arr, int l, int r) {
        while (l < r) { int tmp = arr[l]; arr[l++] = arr[r]; arr[r--] = tmp; }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        k %= n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        System.out.println("Rotated: " + Arrays.toString(arr));
        sc.close();
    }
}
