package aggregation;

public class Aggregation_Child {
	String subject;
	int mark;
	Aggregation_Parent ref;
	public Aggregation_Child(String subject,int mark,Aggregation_Parent ref)
	{
		this.subject=subject;
		this.mark=mark;
		this.ref=ref;
	}
	public void print()
	{
		System.out.println("Subject="+subject+"\nMark="+mark);
		System.out.println("Name="+ref.name+"\nAge="+ref.age);
	}

	public static void main(String[] args) {
		Aggregation_Parent pa=new Aggregation_Parent(8,"janaki");
		
		Aggregation_Child obj=new Aggregation_Child("english",85,pa);
		obj.print();

	}

}
