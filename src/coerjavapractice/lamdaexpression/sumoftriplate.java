package coerjavapractice.lamdaexpression;

public class sumoftriplate {

	
	public static void main(String[] args) {
		
		
		int arr[] = {21,13,47,61,34,40,55,71,87};
		
		for(int i = 0;i<arr.length-2;i++)
		{
			int sum = 0;
			
			for(int j = i+1;j<arr.length;j++)
				
			{
				
				
				sum = arr[i]+arr[j];
				for(int k = i+2;k<arr.length;k++)
				{
					if(sum == arr[k])
					{
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
				
				
			}
		}
		
		
	}
}
