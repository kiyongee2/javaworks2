package abstractex;

public class PhoneTest {

	public static void main(String[] args) {
		
		//Phone phone = new Phone(); 추상 클래스는 객체 생성 불가
		
		SmartPhone smartPhone = new SmartPhone("오상식");
		
		smartPhone.powerOn();
		smartPhone.internetSearch();
		smartPhone.powerOff();
	}
}
