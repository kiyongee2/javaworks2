package inputscanner;

import java.util.Scanner;

public class BankSwtichCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;   //���� ����
		int balance = 0;      //�ܰ�
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			switch(selectNo){
			case 1:
				System.out.println("���ݾ�> ");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.println("��ݾ�> ");
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.println("�ܰ�> " + balance);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("�������� �ʴ� ����Դϴ�. �ٽ� �����ϼ���");
				break;
			}
		}
		System.out.println("���α׷� ����");
		scanner.close();
	}
}
