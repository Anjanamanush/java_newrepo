package abstraction;

public class Abstr_Child extends Abstr_Parent {

	public void print()
	{
		System.out.println("hello world");
	}
	public static void main(String[] args) {
		Abstr_Child abs=new Abstr_Child();
		abs.display();
		abs.add();
		abs.print();
		abs.product();

	}

	@Override
	void display() {
		System.out.println("Welcome");
		
	}

	@Override
	void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

}
