
public class Car {

	private String licensePlate;
	private String owner;
	private String address;
	
	
	public Car(String licensePlate, String owner, String address){
		this.licensePlate = licensePlate;
		this.owner = owner;
		this.address = address;
	}
	
	public String getLicensePlate(){
		return this.licensePlate;
	}
}
