package day7;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class findnegativenumber{
	public static void main (String [] args) {
		List<Integer> al= new ArrayList<Integer>();
		al.add(10);
		al.add(19);
		al.add(-9);
		al.add(-29);
		al.add(-14);
		List<Integer> li = al.stream()
				.filter(x->x<0)
				.collect(Collectors.toList());
		System.out.println("original list: "+ al);
		System.out.println("Filtered list: "+li);
	}
}
