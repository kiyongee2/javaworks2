package ifExample;

public class LimitSpeed {

	public static void main(String[] args) {
		// ���� �ӵ�
		int limitSpeed = 55;
		
		if(limitSpeed >= 50) {
			System.out.println("���� �ӵ� ����!! ���·� 10���� �ΰ� ���");
		}else {
			System.out.println("���� �ӵ� �ؼ�!!");
		}
		System.out.println("�ü� " + limitSpeed + "km�Դϴ�.");
	}
}
