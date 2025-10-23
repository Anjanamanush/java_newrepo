package exception_new;

public class CustomEXception {

	public static void main(String[] args) throws VotingException {
		
		// if you r creating your own exception.it is called 
		//user defined/Custom Exception.
		//It is used to customize the exception according 
		//to user needs.
		int age=15;
		if(age>=18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			throw new VotingException("Not eligible");
			
		}
		

	}

}
