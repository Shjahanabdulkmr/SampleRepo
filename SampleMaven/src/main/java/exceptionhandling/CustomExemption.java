package exceptionhandling;

public class CustomExemption {

	public static void main(String[] args) throws VotingException {
		int age=9;

			if(age>=18)
			{
				System.out.println("eligible for voting");
			}
			else
			{
				throw new VotingException("age under 18");
			}
		}
		
	}


	


