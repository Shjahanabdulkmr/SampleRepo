package exceptionhandling;

public class ThrowExample1 {
public static void main(String[] args) 
{
	int age=19;


		if(age>=18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			throw new ArithmeticException("age under 18");
		}
	}
	
}
