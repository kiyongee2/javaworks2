package inputscanner;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------------------------");
			System.out.print("����> ");
			
			int selectNo = sc.nextInt();
			if(selectNo==1) {
				System.out.print("���ݾ�> ");
				int in = sc.nextInt();
				//balance += sc.nextInt();
				balance += in;
			}else if(selectNo==2) {
				System.out.print("��ݾ�> ");
				int out = sc.nextInt();
				//balance -= sc.nextInt();
				balance -= out;
			}else if(selectNo==3) {
				System.out.println("�ܰ�> " + balance);
			}else {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
		sc.close();
	}
}
