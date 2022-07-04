package anonymous;

public class NoNameTest {

	public static void main(String[] args) {
		NoName noName = new NoName();
		
		noName.field.turnOn();
		
		noName.method1();
		
		noName.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("SmartTV�� �մϴ�.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTV�� ���ϴ�.");
			}
		});
	}

}
