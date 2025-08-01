package day7;
import java.util.List;
import java.util.ArrayList;

public class sumofnumber{
	public static void main (String [] args) {
		List<Integer> al= new ArrayList<Integer>();
		al.add(10);
		al.add(19);
		al.add(14);
		al.add(29);
		int sum =al.stream().reduce(0,Integer::sum);
		System.out.print(sum);
	}
}