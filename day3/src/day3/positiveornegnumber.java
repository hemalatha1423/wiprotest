package day3;
import  java.util.Scanner;
public class positiveornegnumber{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give a number");
		int input=sc.nextInt();
		if(input>0) {
			System.out.println("number is positive");
		}
		else if(input<0) {
			System.out.println("number is negative");
		}
		else {
			System.out.println("number is zero");
		}
		sc.close();
	}
}