package day7;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class main{
	public static void main (String [] args) {
		List<employee> li = new ArrayList<employee>();
		li.add(new employee(100,"John",18000));
		li.add(new employee(200,"brunda",22000));
		li.add(new employee(300,"riya",10000));
		List<employee> li2=li.stream()
				.filter(emp->emp.salary>15000)
				.collect(Collectors.toList());
		for(employee employe:li2) {
			System.out.println(employe.name);
		}
	}
}