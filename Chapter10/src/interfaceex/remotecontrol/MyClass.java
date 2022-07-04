package interfaceex.remotecontrol;

// 인터페이스로 구현 객체를 사용하는 방법
public class MyClass {
	//필드
	RemoteControl rc = new Television();
	
	//생성자
	MyClass(){}
	
	//생성자의 매개 변수 타입으로 선언
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메서드의 지역 변수로 사용
	void methodA() {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메서드의 매개 변수로 사용
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
