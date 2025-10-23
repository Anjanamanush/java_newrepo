package assignment_interface;

public class HDFC implements RBI {

	public static void main(String[] args) {
		HDFC hd=new HDFC();
		double v=hd.recurringDeposit(50000.245, 2);
		System.out.println("Amount "+v);
		

	}


	@Override
	public double recurringDeposit(double amount, int duration) {
		return amount * Math.pow((1 + INTEREST_RATE / 100), duration);
			
	}

}
