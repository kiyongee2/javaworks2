package singleton.car;

public class CarFactory {
	private static CarFactory instance = new CarFactory();  //유일하게 생성한 인스턴스
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}
