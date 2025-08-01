package day7;
import java.util.stream.*;
public class limit{
	public static void main (String [] args) {
		Stream.iterate(3, n->n+3)
		.limit(10)
		.forEach(System.out::println);
	}
}
