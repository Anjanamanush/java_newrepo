package assignment_abstraction;

public class Contractor extends Employee {

	double rate;
	int hours;
	Contractor(String name,double rate,int hours) {
		super(name);
		this.hours=hours;
		this.rate=rate;
		
		
	}

	@Override
	double calculateSalary() {
		
		return hours*rate;
	}

}
