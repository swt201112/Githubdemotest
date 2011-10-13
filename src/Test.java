
public class Test {

	public static void main(String[] args){
		testCase();
	}
	
	private static void testCase(){
		
		// Create new Test-Cars
		Car car0 = new Car("BN-548", "Mickey Mouse", "R�merstra�e 1");
		Car car1 = new Car("BN-123", "Donald Duck", "R�merstra�e 5");
		Car car2 = new Car("K-481", "Tick Duck", "K�lnstra�e 1");
		Car car3 = new Car("BN-123", "Trick Duck", "K�lnstra�e 1");
		Car car4 = new Car("BN-123", "Track Duck", "K�lnstra�e 1");
		
		// Register at TrafficOffice
		TrafficOffice.registerCar(car0);
		TrafficOffice.registerCar(car1);
		TrafficOffice.registerCar(car2);
		TrafficOffice.registerCar(car3);
		TrafficOffice.registerCar(car4);
		
		// Print registered Cars
		TrafficOffice.printLicensePlates();
	}
	
}
