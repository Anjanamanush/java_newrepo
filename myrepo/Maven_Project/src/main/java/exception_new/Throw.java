package exception_new;

public class Throw {

	public static void main(String[] args) throws Exception {
		int age=15;
		if(age>=18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			throw new Exception("Not eligible");
			
		}

	}

}
