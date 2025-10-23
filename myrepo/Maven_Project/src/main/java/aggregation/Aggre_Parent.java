package aggregation;

public class Aggre_Parent {
	String item;
	int price;
	int a;
	int b;
	int c;
	public Aggre_Parent(String item,int price)
	{
		this.item=item;
		this.price=price;
	}
	public Aggre_Parent(int a,int b)
	{
		this.a=a;
		this.b=b;
		int c=a+b;
		this.c=c;
	}

}
