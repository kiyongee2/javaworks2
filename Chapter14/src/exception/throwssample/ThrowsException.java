package exception.throwssample;

public class ThrowsException {
	
	public static void main(String[] args) {
		try {
			//ȣ���ϴ� �ʿ��� try ~ catch ó��
			findClass();  
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.String2");
	}
}
