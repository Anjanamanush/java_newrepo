package polymorphism;

public class Override_Child extends Override_Parent {
	
	public void display()
	{
		super.display();
		System.out.println("Welcome");
	}

	@Override
	public void show(String s) {
		
		super.show("parent method");
		System.out.println(s);
	}

	public static void main(String[] args) {
		Override_Child obj=new Override_Child();
		obj.display();
		obj.show("child method");

	}

}
