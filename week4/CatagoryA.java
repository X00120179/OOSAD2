public class CatagoryA implements SalaryCalculator {

	double baseSalary;
	double OT;
	
	public CatagoryA (double base, double overTime) {
		baseSalary = base;		
		OT = overTime;
	}
	
	public double getSalary() {
		return(baseSalary + OT);
	}

}
