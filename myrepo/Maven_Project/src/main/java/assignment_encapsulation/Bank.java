package assignment_encapsulation;

public class Bank {

	private int pin;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public boolean validatePin()
	{
		if(this.pin==1001 || this.pin==1234 ||this.pin==1212 )
		{
			return true;
		}
		return false;
	}
	
}
