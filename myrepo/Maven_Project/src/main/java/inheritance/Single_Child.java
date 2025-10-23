package inheritance;

public class Single_Child extends Single_Parent {
	
	public void print()
	{
	System.out.println("this is child class show method");
	}

	public static void main(String[] args) {
		
//		Single_Child sc= new Single_Child();
//		sc.print();
//		sc.display();
		
		Single_Parent sp=new Single_Parent();
		sp.display();
		//we cannot accept child class property by creating parent class object.
		

	}

}
