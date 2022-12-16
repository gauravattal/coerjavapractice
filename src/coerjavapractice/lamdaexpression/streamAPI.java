package coerjavapractice.lamdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class streamAPI {
	
	
	public static void main(String[] args) {
		
		
		employee emp = new employee(100,"Gaurav");
		employee emp1 = new employee(200,"Rakhi");
		employee emp3 = new employee(300,"rakhe");
		employee emp4 = new employee(400,"atl");
		employee emp5 = new employee(500,"ramkisani");
		
		
		List<employee> l = new ArrayList<employee>();
		
		l.add(emp);
		l.add(emp1);
		l.add(emp3);
		l.add(emp4);
		l.add(emp5);
		
		/*
		 * List<employee> collect = l.stream().sorted((o1, o2) ->
		 * o1.getName().length()<o2.getName().length()?-1:o1.getName().length()>o2.
		 * getName().length()?1:0).collect(Collectors.toList());
		 * 
		 * collect.forEach(t -> System.out.println(t));
		 */
		
		  List<employee> collect2 = l.stream().filter(t ->
		  t.getName().startsWith("G")).collect(Collectors.toList());

		  
 employee employee = l.stream().min((o1, o2) ->o1.getId()<o2.getId()?-1:o1.getId()<o2.getId()?-1:0).get();
		  
 
 System.out.println(employee);
		  
	/* ArrayList<Integer> list = new ArrayList<Integer>(); */
		  
		 
		/*
		 * list.add(20); list.add(43); list.add(9); list.add(14); list.add(17);
		 * list.add(23); list.add(65); list.add(17);
		 * 
		 * 
		 * List<Integer> list2 = list.stream().filter(t
		 * ->t%2==0).collect(Collectors.toList()); System.out.println(list2);
		 * 
		 * List<Integer> list3 = list.stream().distinct().collect(Collectors.toList());
		 * 
		 * System.out.println(list3);
		 * 
		 * Long i =list.stream().count();
		 * 
		 * System.out.println(i);
		 */
		
		
	}

}
