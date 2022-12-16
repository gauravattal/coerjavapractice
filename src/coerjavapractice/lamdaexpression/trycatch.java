package coerjavapractice.lamdaexpression;

public class trycatch {

	
	public static int demo()
	{
		
		
		
		
		try {
			
			int a = 10/0;
		
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		finally{
		
			System.out.println("finally bolck called");
		
		}
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(trycatch.demo());
		
		
		

	}
	
}
