package assignment_inheritance;
import java.util.Scanner;
public class EmployeeBasic {
	double basicPay, deduction, bonus;
	public void getDetails()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Basic pay:");
		basicPay = sc.nextDouble();
		System.out.println("Enter deduction:");
		deduction = sc.nextDouble();
		System.out.println("Enter Bonus:");
		bonus = sc.nextDouble();
		sc.close();
	}
	
}
