package exception_new;

public class ExcepClass {

	public static void main(String[] args) {
	
		//Arithmetic Exception
		try
		{
			int n=10/0;
			System.out.println(n);
		}
		catch(ArithmeticException ae)
		{ 
			System.out.println("Exception handled");
		}
		finally
		{
			System.out.println("Exit code");
		}
		
		//ArrayIndexOutofBoundException
//		int arr[]= {1,2,1,4,3};
//		for(int i=0;i<7;i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		//NullPointerException
//		String s=null;
//		System.out.println(s.length());
		
		

	}

}
