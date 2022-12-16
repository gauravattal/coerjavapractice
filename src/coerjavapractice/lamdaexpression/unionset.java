package coerjavapractice.lamdaexpression;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class unionset {
	
	public static void main(String[] args) {
		
	int arr1[] = {1,2,3,6,7,8,11,15,0};
	int arr2[] = {15,11,8,13,12};
	
	
	//union of set
	
	HashSet<Integer> set = new HashSet<Integer>();
	List<Integer> list = new ArrayList<>();
	
	
	
	/*
	 * for(int i = 0;i<arr1.length;i++) { set.add(arr1[i]);
	 * 
	 * } for(int j = 0;j<arr2.length;j++) { set.add(arr2[j]); }
	 * 
	 * set.stream().forEach(t->System.out.println(t));
	 */
	
	
	
	for(int i = 0;i<arr1.length;i++)
	{
		set.add(arr1[i]);
		
	}
	
	for(int j = 0 ;j<arr2.length;j++)
	{
		list.add(arr2[j]);
	}
	
	set.retainAll(list);
	
	System.out.println(set);
	
	}
	
	
	
	
	//retain all element of set
	
	
	

}
