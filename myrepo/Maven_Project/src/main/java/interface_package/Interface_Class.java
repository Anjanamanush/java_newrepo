package interface_package;

public class Interface_Class implements Interface1 {

	public static void main(String[] args) {
		Interface_Class s=new Interface_Class();
		s.print();
		s.read();
		s.show();
		Interface1.add(5,6);
		
		// Reference creation
		
		Interface1 obj= new Interface_Class();
		obj.print();
		obj.read();
		
	}

	public void show()
	{
		System.out.println("This is child class method");
	}
	@Override
	public void print() {
		System.out.println("This is interface method");
		
	}

}
