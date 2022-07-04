package vehiclecasting;

public class Driver {
	
	public void drive(Vehicle vehicle) {
		//vehicle이 Bus의 객체라면
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
