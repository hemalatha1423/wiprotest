package day7;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class map{
	public static void main (String [] args) {
		List<String> al= new ArrayList<String>();
		al.add("brunda");
		al.add("hemalatha");
		al.add("bhavani");
		al.add("anusha");
		al.add("deepthi");
		al.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
	}
}
