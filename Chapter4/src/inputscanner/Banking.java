package inputscanner;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int balance = 0;  //�ܾ�
		String selectNo = "";  //�޴� ��ȣ
		int money = 0;    //��,��ݾ�
				
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------------");
			System.out.print("����> ");
			
			selectNo = scanner.next();
			
			switch(selectNo){
			case "1":
				while(true) {
					System.out.println("���ݾ�> ");
					money = scanner.nextInt();
					if(money < 1000) {
						System.out.println("�ʱ� �Աݾ��� 1000�� �̻��Դϴ�. �ٽ� �Է��ϼ���");
					}
					else {
						balance += money;
						System.out.printf("%,d�� ����ó�� �Ǿ����ϴ�.\n", money);
						break;
					}
				}
				break;
			case "2":
				while(true) {
					System.out.println("��ݾ�> ");
					money = scanner.nextInt();
					if(money > balance || money < 0) {
						System.out.println("�ܾ��� �����մϴ�. �ٽ� �Է��ϼ���");
					}
					else {
						balance -= money;
						System.out.printf("%,d�� ����ó�� �Ǿ����ϴ�.\n", money);
						break;
					}
				}
				break;
			case "3":
				System.out.printf("�ܰ�> %,d��\n", balance);
				break;
			case "4":
				run = false;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		}
		System.out.println("���α׷� ����");
		scanner.close();
	}
}

