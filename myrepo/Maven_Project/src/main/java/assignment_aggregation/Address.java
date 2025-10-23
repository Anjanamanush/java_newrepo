package assignment_aggregation;

public class Address {

	String address;
	Student ref;
	public  Address(String address,Student ref)
	{
		this.address=address;
		this.ref=ref;
	}
	public void print()
	{
		System.out.println("Name :"+ref.name+"\nRollNo: "+ref.rollno);
		System.out.println("Address :"+address);
	}
	public static void main(String[] args) {
		Student s= new Student("janaki",10);
		
		Address a=new Address("Trivandrum",s);
		a.print();

	}

}
