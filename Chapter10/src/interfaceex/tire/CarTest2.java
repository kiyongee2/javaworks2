package interfaceex.tire;

public class CarTest2 {

	public static void main(String[] args) {
		Car2 myCar = new Car2();
		//myCar.run();
		
		//�չ��� ��ü
		myCar.tires[0] = new KumTire();
		myCar.tires[1] = new KumTire();
		
		myCar.run();
	}
}
