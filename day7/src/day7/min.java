package day7;
import java.util.List;
import java.util.ArrayList;

public class min{
	public static void main (String [] args) {
		List<Integer> al= new ArrayList<Integer>();
		al.add(10);
		al.add(19);
		al.add(14);
		al.add(29);
		int m=al.stream().min((x,y)->x>y?1:-1).get();
		System.out.println(m);
	}
}