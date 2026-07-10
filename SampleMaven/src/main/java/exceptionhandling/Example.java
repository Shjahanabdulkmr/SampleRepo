package exceptionhandling;

public class Example {

	public static void main(String[] args) {
		int a=10,b=0,c;
		try
		{
		c=a/b;
		}
		catch(ArithmeticException e)
		{
			b=2;
			int d=a/b;
			System.out.println(d);
			System.out.println(e);
		}
		finally
		{
			System.out.println("Mandatory code");
		}
		
		
	

	}

}
