package assignment_abstraction;

public class FullTimeEmployee extends Employee {

	double dailyrate;
	FullTimeEmployee(String name,double dailyrate) {
		super(name);
		this.dailyrate=dailyrate;
		
	}

	@Override
	double calculateSalary() {
		return dailyrate*8;
	}

}
