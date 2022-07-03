package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//자동차의 기능을 순서대로 구현함, final이므로 재정의 할수 없음
	public final void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
}
