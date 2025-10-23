package interface_package;

public class MultipleInterface implements InterfaceMul1,InterfaceMul2,InterfaceMul3 {

	public static void main(String[] args) {
		MultipleInterface ob=new MultipleInterface();
		ob.display();
		ob.show();
		ob.read();	

	}

	@Override
	public void read() {
		System.out.println("This is interface3 InterfaceMul3");
		
	}

	@Override
	public void show() {
		System.out.println("This is interface2 InterfaceMul2");
		
	}

	@Override
	public void display() {
		System.out.println("This is interface1 InterfaceMul1");
		
	}

}
