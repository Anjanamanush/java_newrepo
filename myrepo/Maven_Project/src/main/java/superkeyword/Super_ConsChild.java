package superkeyword;

public class Super_ConsChild extends Sper_ConsParent{
	public Super_ConsChild()
	{
		super(4,5);
		System.out.println("Hello World");
	}
	public Super_ConsChild(int a, int b)
	{
		this(3.2f,4.2f);
		int c=a*b;
		System.out.println("product= "+c);
	}
	public Super_ConsChild(float d,float f)
	{
		float e=d+f;
		System.out.println("Sum = "+e);
	}

	public static void main(String[] args) {
		
		Super_ConsChild object=new Super_ConsChild();
		Super_ConsChild object1=new Super_ConsChild(2,3);
		

	}

}
