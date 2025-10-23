package inheritance;

public class Hier_Child1 extends Hier_Parent {
	public void sum(int a ,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}

	public static void main(String[] args) {
		Hier_Child1 obj1=new Hier_Child1();
		obj1.mul(5, 6);
		obj1.sum(5, 2, 3);

	}

}
