package coerjavapractice.lamdaexpression;

public class anonymusinnerclass {

	
	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				 
				for(int i = 0;i<5;i++)
				{
					System.out.println(i);
					
				}
				
			}
		};
		Thread t = new Thread(r);
		t.start();
		System.out.println();
		
		for(int j= 0;j<5;j++)
		{
			System.out.println(j);
		}
		
		
		
	}
	
}
