package access_modifier;

public class Specifier_1 {
	public void pubMehod()
	{
		System.out.println("This is public method");
	}
	private void privMehod()
	{
		System.out.println("This is private method");
	}
	protected void protMehod()
	{
		System.out.println("This is protected method");
	}
	void defMehod()
	{
		System.out.println("This is default method");
	}

	public static void main(String[] args) {
		Specifier_1 obj=new Specifier_1();
		obj.pubMehod();
		obj.privMehod();
		obj.protMehod();
		obj.defMehod();
	}

}
