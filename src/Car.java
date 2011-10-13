
public class Car {

	private String licensePlate;
	private String owner;
	private String address;
	private String color;
	
	
	public Car(String licensePlate, String owner, String address, String color){
		this.licensePlate = licensePlate;
		this.owner = owner;
		this.address = address;
		this.color = color;
	}
	
	public String getLicensePlate(){
		return this.licensePlate;
	}
}
