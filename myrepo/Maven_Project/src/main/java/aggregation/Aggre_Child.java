package aggregation;

public class Aggre_Child {
	String material;
	int cost;
	Aggre_Parent ref;
	Aggre_Parent ref1;
	public Aggre_Child(String material,int cost,Aggre_Parent ref,Aggre_Parent ref1)
	{
		this.ref=ref;
		this.ref1=ref1;
		this.cost=cost;
		this.material=material;
	}
	public void display()
	{
		System.out.println("Material ="+material+"\nCost="+cost );
		System.out.println("Item ="+ref.item+"\nPrice="+ref.price );
		System.out.println("a ="+ref1.a+"\nb="+ref1.b+"\nc="+ref1.c );
	}
	public static void main(String[] args) {
		Aggre_Parent ap=new Aggre_Parent("computer",2500);
		Aggre_Parent ap1=new Aggre_Parent(10,25);
		
		
		Aggre_Child ac=new Aggre_Child("pen",10,ap,ap1);
		ac.display();
		

	}

}
