package interfaceex.tire;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		//myCar.run();
		
		//�չ��� ��ü
		myCar.frontLeftTire = new KumTire();
		myCar.frontRightTire = new KumTire();
		
		myCar.run();
	}
}
