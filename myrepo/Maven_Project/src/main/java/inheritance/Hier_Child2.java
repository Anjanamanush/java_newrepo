package inheritance;

public class Hier_Child2 extends Hier_Parent{
	public void show()
	{
		System.out.println("This is Child 2");
	}

	public static void main(String[] args) {
		Hier_Child2 obj2= new Hier_Child2();
		obj2.mul(2, 3);
		obj2.show();

	}

}
