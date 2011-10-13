import java.util.ArrayList;


public class TrafficOffice {

	private static ArrayList<Car> registeredCars = new ArrayList<Car>();
	
	
	
	public static void registerCar(Car car){
		registeredCars.add(car);
	}
	
	
	public static void printLicensePlates(){
		for (Car cars: registeredCars){
			System.out.println(cars.getLicensePlate());
		}
	}



	
}
