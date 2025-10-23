package encapsulation;

public class Encap_Child {

	public static void main(String[] args) {
		
		Encap_Parent ob=new Encap_Parent();
		ob.setName("hello");
		String s=ob.getName();
		System.out.println("Name : "+s);
		
		ob.setNumber(5);
		int b=ob.getNumber();
		System.out.println("Number : "+b);
		
	}

}
