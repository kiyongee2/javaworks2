package vehiclecasting;

public class Driver {
	
	public void drive(Vehicle vehicle) {
		//vehicle�� Bus�� ��ü���
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
