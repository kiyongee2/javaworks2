package interfaceex.remotecontrol;

public class MyClassTest {
	public static void main(String[] args) {
		System.out.println("1)-------------------");
		
		//rc �ʵ带 ���
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2)-------------------");
		//�������� �Ű� ������ ���
		MyClass myClass2 = new MyClass(new Television());
		
		System.out.println("3)-------------------");
		//�޼����� ���� ������ ���
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4)-------------------");
		//�޼����� �Ű������� ���
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
	}
}
