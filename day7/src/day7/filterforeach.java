package day7;
import java.util.List;
import java.util.ArrayList;

public class filterforeach{
	public static void main (String [] args) {
		List<Integer> al= new ArrayList<Integer>();
		al.add(10);
		al.add(19);
		al.add(14);
		al.add(29);
		al.stream()
				.filter(x->x%2==0)
				.forEach(x->System.out.print(x+" "));
	}
}
