package vehicle;

public class DriverMain {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);  //Vehicle vehicle = bus //�ڵ� Ÿ�Ժ�ȯ
		driver.drive(taxi);
	}

}
