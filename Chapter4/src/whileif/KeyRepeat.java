package whileif;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		//y - "��� �ݺ��մϴ�", n - "�ݺ��� �ߴ��մϴ�."
		//�� �̿��� Ű�� "�������� �ʴ� Ű�Դϴ�."
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("��� �ݺ��ұ��?(y/n) : ");
			
			String key = sc.nextLine();
			
			if(key.equals("y") || key.equals("Y")) { //equals() ���ڿ� ���Լ�
				System.out.println("��� �ݺ��մϴ�.");
			}
			else if(key.equals("n") || key.equals("N")) {
				System.out.println("�ݺ��� �ߴ��մϴ�.");
				break;
			}
			else {
				System.out.println("�������� �ʴ� Ű�Դϴ�.");
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
	}
}
