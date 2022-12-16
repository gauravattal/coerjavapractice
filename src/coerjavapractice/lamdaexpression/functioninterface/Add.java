package coerjavapractice.lamdaexpression.functioninterface;


@FunctionalInterface
public interface Add {

	
	public abstract void add(int a,int b);
	
	default void m1()
	{
		System.out.println("this is default method");
	}


	static void m2()
	{
		System.out.println("static method called");
	}
	
}

