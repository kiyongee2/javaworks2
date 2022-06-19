package template;

import java.util.ArrayList;
public class CarTest {
	public static void main(String[] args) {
//		System.out.println("====���� �����ϴ� �ڵ���===");
//		Car myCar = new AICar();
//		myCar.run();
//	
//		System.out.println("====����� �����ϴ� �ڵ���===");
//		Car hisCar = new ManualCar();
//		hisCar.run();
		
		ArrayList<Car> carList = new ArrayList<>();
		Car aiCar = new AICar();
		Car manualCar = new ManualCar();
		carList.add(aiCar);
		carList.add(manualCar);
		
		for(Car car : carList) {
			car.run();
		}
		
	}
}
