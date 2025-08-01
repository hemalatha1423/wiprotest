package day7;
import java.util.List;
import java.util.ArrayList;

public class counteven{
	public static void main (String [] args) {
		List<Integer> al= new ArrayList<Integer>();
		al.add(10);
		al.add(19);
		al.add(14);
		al.add(29);
		long c=al.stream().filter(x->x %2==0).count();
		System.out.println(c);
	}
}

		