package abstractex.car;

public class CarTest {

	public static void main(String[] args) {
		
		//Car car = new Car();
		
		Bus bus = new Bus();
		AutoCar autoCar = new AutoCar();
		
		bus.run();
		autoCar.run();
		
		bus.refuel();
		autoCar.refuel();
		
		bus.takrPassenger();
		autoCar.run();
		
		bus.stop();
		autoCar.stop();
	}
}
