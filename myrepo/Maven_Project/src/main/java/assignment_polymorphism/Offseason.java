package assignment_polymorphism;

public class Offseason extends Onseason {

	double discount;
	public void discount(double total)
	{
		super.discount(5000);
		discount=total*0.15;
		System.out.println("Offseason Discount : "+discount);;
	}
	public static void main(String[] args) {
		
		Offseason o=new Offseason();
		o.discount(6000);

	}

}
