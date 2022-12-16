package coerjavapractice.lamdaexpression;

import java.util.Arrays;
import java.util.stream.Stream;

public class secondlargest {
	
	public static void main(String[] args) {
		
		int arr[] = {1,17,5,6,42,8,10,12,30,9};
		/*
		 * Arrays.sort(arr); System.out.println(arr[arr.length-2]);
		 */
		
		
		int max = 0;
		int temp = 0;
		
 		for(int i = 0 ;i<=arr.length-1;i++)
		{
			
		if(i==0)
		{
			if(arr[i]>arr[i+1]){
	
             max=arr[i];
          
			}else 
			{
				max= arr[i+1];
			}
		}else
		{
			
			if(max <arr[i])
			{
				temp = max;
				max= arr[i];
				
			}else if(arr[i]<max&&arr[i]>temp)
			{
				temp = arr[i];
			}
			
		}
			
		}
		System.out.println(max);
		System.out.println(temp);
		 
		
		
	}

}
