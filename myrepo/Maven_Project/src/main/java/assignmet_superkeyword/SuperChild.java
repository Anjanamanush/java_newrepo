package assignmet_superkeyword;

public class SuperChild extends SuperParent {

	public void display()
	{
		int sum = super.add();
		System.out.println("Addintion Result is : "+sum);
		if (sum % 10 == 0) {
            System.out.println("The sum is divisible by 10.");
        } else {
            System.out.println("The sum is NOT divisible by 10.");
        }
		
	}
	public static void main(String[] args) {
		SuperChild sc=new SuperChild();
		sc.add();
		sc.display();

	}

}
