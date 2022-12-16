package coerjavapractice.lamdaexpression;


import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class meargarrays {
	
	public static void main(String[] args) {
		
		
		
		int arr1[] = {1,2,4,0,3,22,90,30};
		int arr2[] = {1,3,4,9,5,6,7,11};
		
		Arrays.sort(arr1);
	
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i =0 ;i<arr1.length;i++)
		{
		set.add(arr1[i]);
		}
		
		for(int j =0 ;j<arr1.length;j++)
		{
		set.add(arr2[j]);
		}
		Integer arr3[] = new Integer[set.size()];
		
		arr3 = set.toArray(arr3);
		
		System.out.println(Arrays.toString(arr3));
	}

}
