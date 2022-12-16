package coerjavapractice.lamdaexpression;


import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.RandomAccess;
import java.util.function.Function;
import java.util.function.Predicate;

import coerjavapractice.lamdaexpression.functioninterface.Add;

public class mainprogram {
	
  @SuppressWarnings("deprecation")
public static void main(String[] args) {
	

	  
	  
		/*
		 * Add a = (i,j)->System.out.println(j+i); a.add(20, 30); a.m1();
		 * 
		 * Add.m2();
		 */
		/*
		 * String s1 = "Gaurav"; String s2 = "Attal";
		 * 
		 * 
		 * ArrayList<String> arr = new ArrayList<String>();
		 * 
		 * 
		 * Predicate<String> p = t -> t.length()>5;
		 * 
		 * if(p.test(s1)) { arr.add(s1); }
		 * 
		 * System.out.println(arr);
		 */
	  
	  
		/*
		 * profile p = new profile(100,"gaurav Attal", 8); profile p1 = new profile(200,
		 * "rakhi attal", 30); profile p2 = new profile(300, "daniel", 10); profile p3 =
		 * new profile(400, "dinesh kumar", 70); profile p4 = new profile(500, "yuzi",
		 * 32); profile p5 = new profile(600, "dinesh kartika",50);
		 * 
		 * 
		 * List<profile> list = new ArrayList<>();
		 * 
		 * list.add(p); list.add(p1); list.add(p2); list.add(p3); list.add(p4);
		 * list.add(p5);
		 * 
		 * 
		 * Predicate<profile> pr = t ->t.getAge()>45; list.forEach(t -> {
		 * 
		 * if(pr.test(t)) { System.out.println(t); } });
		 * 
		 * ArrayList<profile> list2 = new ArrayList<>();
		 */
	  
	   
	  
		
		  Function<profile, Integer> f = t -> {
		  
		  int birthyear = t.getBirthYear();
		  int birthMoth = t.getBirthMonth();
		  int birthday = t.getBirthday();
		  
		  LocalDate birthdate = LocalDate.of(birthyear,birthMoth, birthday); 
		  System.out.println(birthday);
		  LocalDate currentdate= LocalDate.of(new Date().getYear(), new Date().getMonth(), new Date().getDay());
		  
		  System.out.println(new Date());
		 
		  
		  System.out.println(currentdate);
		  
		  if ((birthdate != null) && (currentdate != null)) {
	            return Period.between(currentdate,birthdate).getYears();
	            
	        }
		  else {
	            return 0;
	        }
		  

	        };
	        
	        profile p = new profile();
	        p.setId(100);
	        p.setName("gaurav");
	        p.setBirthday(20);
	        p.setBirthMonth(8);
	        p.setBirthYear(1993);
	        p.setAge(f.apply(p));
	        
	      System.out.println(new Date().getDay()); 
	      System.out.println( new Date().getYear());
	       
	        
	        System.out.println(p);
		 

	  
	

}

}
