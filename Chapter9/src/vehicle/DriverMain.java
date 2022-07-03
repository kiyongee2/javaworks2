package vehicle;

public class DriverMain {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);  //Vehicle vehicle = bus //자동 타입변환
		driver.drive(taxi);
	}

}
