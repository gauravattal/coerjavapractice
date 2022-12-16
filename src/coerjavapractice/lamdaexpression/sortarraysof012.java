package coerjavapractice.lamdaexpression;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class sortarraysof012 { 
	
	
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,0,1,1,2,0,0,1,2,2};
		
	    HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
	
	    for(int i = 0;i<arr.length;i++)
	    {
	    	
	    	if(hm.get(arr[i])==null) {
	    		
	    		hm.put(arr[i], 1);
	    	}else
	    	{
	    		hm.put(arr[i], hm.get(arr[i])+1);
	    	}
            	    		
	    	
	    }
	    
	    Set<Entry<Integer, Integer>> entrySet = hm.entrySet();
	    for(Entry<Integer, Integer> entry :entrySet)
	    {
	    	int i = entry.getValue();
	    	
	    	while(i>0)
	    	{
	    		System.out.print(entry.getKey());
	    		i--;
	    		
	    	}
	    	
	    	
	    }
	
	
		
		
	}

}
