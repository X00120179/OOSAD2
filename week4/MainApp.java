public class MainApp {
	public static void main(String [] args) {


		System.out.println("################");
		System.out.println("#    Week 4    #");
		System.out.println("#      Lee     #");
		System.out.println("#     Healy    #");
		System.out.println("#  X00120179   #");
		System.out.println("################");

		SalaryCalculator c = new CatagoryA(10000, 200);
		Employee e = new Employee("Jennifer", c);
		e.display();
		c = new CatagoryB(20000, 800);
		e = new Employee ("Shania", c);
		e.display();

		
	}
}
