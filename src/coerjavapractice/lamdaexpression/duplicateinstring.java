package coerjavapractice.lamdaexpression;

import java.util.HashMap;

public class duplicateinstring {

	public static void main(String[] args) {
		

	
	String s = "I am the best guy in town";
	char[] ch = s.toCharArray();
	
	
	
	HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	for(int i = 0 ;i<ch.length;i++)
		{
		if(hm.get(ch[i])==null)
		{
			hm.put(ch[i],1);
		}
		else	
		{
			 hm.put(ch[i], hm.get(ch[i])+1);
			
		}
		
		}

hm.keySet().forEach(t ->System.out.println("character "+t+" number of occuring "+hm.get(t)) );	 
	
	
	
}
	
}
