package assignment_encapsulation;

public class User {

	public static void main(String[] args) {
		Bank ob=new Bank();
		ob.setPin(10);	
		
		if (ob.validatePin()) {
            System.out.println("PIN is valid. Access granted.");
        } else {
            System.out.println("Invalid PIN. Access denied.");
        }

	}

}
