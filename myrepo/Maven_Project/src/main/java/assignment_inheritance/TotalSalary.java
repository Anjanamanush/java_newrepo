package assignment_inheritance;

public class TotalSalary extends CalculateHra {

	double totalsalary;
	public void totalSalary()
	{
		totalsalary= (basicPay+hra-pf-deduction+bonus);
		//System.out.println(totalsalary);
	}
}
