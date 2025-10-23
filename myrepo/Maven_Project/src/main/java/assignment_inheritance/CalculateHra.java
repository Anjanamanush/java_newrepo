package assignment_inheritance;

public class CalculateHra extends EmployeeBasic {

	 double hra, pf;
	public void calculateData()
	{
		hra=0.05 * basicPay;
		pf=0.20 * basicPay;
		//System.out.println(hra);
		//System.out.println(pf);
	}
}
