package abstractex;

public class PhoneTest {

	public static void main(String[] args) {
		
		//Phone phone = new Phone(); �߻� Ŭ������ ��ü ���� �Ұ�
		
		SmartPhone smartPhone = new SmartPhone("�����");
		
		smartPhone.powerOn();
		smartPhone.internetSearch();
		smartPhone.powerOff();
	}
}
