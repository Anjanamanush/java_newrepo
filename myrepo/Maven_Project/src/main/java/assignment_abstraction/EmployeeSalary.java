package assignment_abstraction;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		Employee contr=new Contractor("anjana",450.44,6);
		System.out.println("Contractor Salary ="+contr.calculateSalary());
		Employee fullemp=new FullTimeEmployee("anju",500.45);
		System.out.println("Full Time Employee Salary ="+fullemp.calculateSalary());

	}

}
