
public class Pulsar extends Bike {
	int cc;
	
	@Override
	void driving() {
		System.out.println("Pulsar riding");
	}
	
	@Override
	void start(){
		System.out.println("Pulsar starts");
	}

	public static void main(String[] args) {
		Pulsar neo= new Pulsar();
		neo.driving();
		neo.start();
		neo.brand="Bajaj";
		neo.cc=150;
		neo.noOfWheels=2;
		
		Vehicle vehicle =new Vehicle();
		vehicle.driving();
		vehicle.start();
		
		Bike bk= new Bike();
		//bk.driving();
		//bk.start();
		System.out.println("Brand "+neo.brand+" cc "+
		neo.cc+" wheels "+
		neo.noOfWheels);
	}
}
