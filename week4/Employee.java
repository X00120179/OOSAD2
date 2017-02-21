public class Employee {
	
	SalaryCalculator empType;
	String name;

	public Employee(String s, SalaryCalculator c) {
		name = s;
		empType = c;
	}

	public void display() {
		System.out.println("Name:\t" + name);
		System.out.println("Salary:\t" + empType.getSalary());
	}

}
