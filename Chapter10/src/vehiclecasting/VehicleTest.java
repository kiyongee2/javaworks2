package vehiclecasting;

public class VehicleTest {

	public static void main(String[] args) {
		//강제 타입 변환은 구현 객체가 
		//인터페이스 타입으로 변환되어 있는 상태에서 가능
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//checkFare()가 보이지 않음
		
		//강체 타입 변환
		Bus bus = (Bus)vehicle;
		
		bus.run();
		bus.checkFare();
	}
}
