public class Driver {


	private Singleton testSingleton;
	
	public static void main(String[] args) {
		
		System.out.println("\n\t########################################################");
		System.out.println("\t###  Week 6 Lab - Singleton - Lee Healy - X00120179 ####");
		System.out.println("\t########################################################\n");

		// 1.) Create an instance.
		// 2.) Call the getInstance() method once.
		// 2.1) Should tell me new instance created.
		// 3.) Call the getInstance() method for a second time. 
		// 3.1) Should tell me that the instance was already created
		
		// First call - Output will tell me a new instance was created.
		Singleton singleton1 = Singleton.getInstance();

		// Second call - Output will tell me that an instance was already previously created beforehand.
		Singleton.getInstance();
		
		// Third call - Output will again tell me that the instance was already previosuly created.
		Singleton.getInstance();
	}

}
