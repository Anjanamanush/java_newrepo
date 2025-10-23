package abstraction;

public class Abs_Child extends Abs_Parent {

	public static void main(String[] args) {
		Abs_Parent ab=new Abs_Child();
		ab.print();
		ab.display(7, 3);
		
		//ac.mul(6, 5);		
//		we cannot access child class property 
//		by creating parent class reference/object
		
		Abs_Child ac=new Abs_Child();
		ac.mul(6, 5);
		
	}
	
	public void mul(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
	}

	@Override
	void print() {
		System.out.println("This is Abstract Parent Method");
		
	}

}
