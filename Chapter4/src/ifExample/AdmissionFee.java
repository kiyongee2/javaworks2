package ifExample;

public class AdmissionFee {

	public static void main(String[] args) {
		int age = 9;
		int fee;   //�����(���)
		
		if(age < 8) {
			fee = 1000;
			System.out.println("���� �� �Ƶ��Դϴ�.");
		}
		else if(age < 14) {
			fee = 2000;
			System.out.println("�ʵ��л��Դϴ�.");
		}
		else if(age < 20) {
			fee = 2500;
			System.out.println("��, ����л��Դϴ�.");
		}
		else {
			fee = 3000;
			System.out.println("�Ϲ����Դϴ�.");
		}
		//System.out.println("������ " + fee + "���Դϴ�.");
		System.out.printf("������ %,d���Դϴ�.", fee);
	}
}
