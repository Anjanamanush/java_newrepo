package interface_package;

public interface Interface1 {

	abstract void print();
	default void read()
	{
		System.out.println("this is default method");
	}
	public static void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum :"+c);
	}
}
