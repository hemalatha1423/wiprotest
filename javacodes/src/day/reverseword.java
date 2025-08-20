package day;
import java.util.*;

public class reverseword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        for (String w : words) {
            System.out.print(new StringBuilder(w).reverse() + " ");
        }
        sc.close();
    }
}
