
public class Bike extends Vehicle {
	String brand;
	
	@Override
	void driving() {
		System.out.println("Bike riding");
	}
	
	@Override
	void start(){
		System.out.println("Bike starts");
	}
}
