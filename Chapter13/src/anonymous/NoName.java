package anonymous;

public class NoName {
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV¸¦ ²ü´Ï´Ù.");
		}
	};
	
	void method1() {
		RemoteControl lovalVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio¸¦ ÄÕ´Ï´Ù.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio¸¦ ²ü´Ï´Ù.");
			}
		};
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
