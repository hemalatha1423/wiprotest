package day3;

import java.util.Scanner;

public class findlargestandsmallest{
    public static void main(String[] args) {
        //int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
        sc.close();
    }
}
