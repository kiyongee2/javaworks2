package vehiclecasting;

public class DriverTest {

	public static void main(String[] args) {
		//driver °´Ã¼ »ý¼º
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
