package coerjavapractice.lamdaexpression;

import coerjavapractice.lamdaexpression.functioninterface.mathoperation;

public class anonymusinnerclass2 {
	
	public static void main(String[] args) {
		mathoperation m = new mathoperation() {
			
			
			
			@Override
			public void sub(int a, int b) {
				System.out.println(a-b);
				System.out.println(i);
				
			}
			
			@Override
			public void mul(int a, int b) {
			System.out.println(a*b);
				
			}
			
			@Override
			public void div(int a, int b) {
			System.out.println(a/b);
				
			}
			
			@Override
			public void add(int a, int b) {
			System.out.println(a+b);
				
			}
		};
	
		
		m.sub(30, 10);
		
	}

}
