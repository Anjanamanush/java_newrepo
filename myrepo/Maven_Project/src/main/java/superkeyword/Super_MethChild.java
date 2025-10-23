package superkeyword;

public class Super_MethChild extends Super_MethParent {
	public void add(int a,int b)
	{
		this.print();
		super.display();
		int c=a+b;
		System.out.println(c);
		super.add(7, 8);
		
	}
	public void print()
	{
		System.out.println("this is child class");
	}

	public static void main(String[] args) {
		Super_MethChild o=new Super_MethChild();
		o.add(4, 6);
//		o.display();

	}

}
