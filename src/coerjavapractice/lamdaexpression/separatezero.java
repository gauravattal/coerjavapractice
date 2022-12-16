package coerjavapractice.lamdaexpression;

public class separatezero {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int arr[] = {1,2,3,4,6,7};
		
		
		
	int j =  arr.length-1;
		for(int i = 0 ;i<arr.length/2;i++)
		{
			
			
			 
			  int temp = arr[i];
			  arr[i]=arr[j];
			  arr[j]=temp;
			  
			  j--; 
			  
		}
			 
		
		
		
		
		  for(int i : arr)
		  
		  {
		  
		  System.out.println(i); 
		  }
		 
	}
}

