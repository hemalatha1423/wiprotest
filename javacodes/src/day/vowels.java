package day;
import java.util.*;
public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int v = 0, c = 0;
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) v++;
                else c++;
            }
        }
        System.out.println("Vowels: " + v + ", Consonants: " + c);
        sc.close();
    }
}
