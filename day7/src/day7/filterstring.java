package day7;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class filterstring{
	public static void main (String [] args) {
		List<String> al= new ArrayList<String>();
		al.add("brunda");
		al.add("hemalatha");
		al.add("bhavani");
		al.add("anusha");
		al.add("deepthi");
		List<String> li = al.stream()
				.filter(a->a.contains("e"))
				.collect(Collectors.toList());
		System.out.println("original list: "+ al);
		System.out.println("Filtered list: "+li);
	}
}
