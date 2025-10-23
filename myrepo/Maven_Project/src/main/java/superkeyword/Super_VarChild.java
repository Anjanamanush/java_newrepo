package superkeyword;

public class Super_VarChild extends Super_VarParent {
	String clr="green";
	public void display()
	{
		System.out.println(super.clr);
	}
	public static void main(String[] args) {
		Super_VarChild ob=new Super_VarChild();
		System.out.println(ob.clr);
		ob.display();

	}

}
