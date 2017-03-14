public class Singleton {

	private static Singleton instance = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if(instance == null){	// If instance has NOT been created.
			instance = new Singleton(); // Create an instance.
			System.out.println("\tNew instance created."); // Print out for testing.
			return instance; // Return newly created instance.
		} 
		else {
			System.out.println("\tInstance previously already created."); // Print out for testing.
			return instance; // Else return the prevously already created instance.	
		}		
	}
}
