package assignment_inheritance;

public class SalarySlip extends TotalSalary{

	public void display()
	{
		System.out.println("\n------- SALARY SLIP -------");
        System.out.println("Basic Pay     : " + basicPay);
        System.out.println("Deduction     : " + deduction);
        System.out.println("HRA (5%)      : " + hra);
        System.out.println("PF (20%)      : " + pf);
        System.out.println("Bonus         : " + bonus);
        System.out.println("Total Salary  : " + totalsalary);
	}
	public static void main(String[] args) {
		
		SalarySlip ss=new SalarySlip();
		ss.getDetails();
		ss.calculateData();
		ss.totalSalary();
		ss.display();
		
	}

}
