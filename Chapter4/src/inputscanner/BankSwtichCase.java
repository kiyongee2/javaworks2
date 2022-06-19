package inputscanner;

import java.util.Scanner;

public class BankSwtichCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			switch(selectNo){
			case 1:
				System.out.println("예금액> ");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.println("출금액> ");
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.println("잔고> " + balance);
				break;
			case 4:
				run = false;	
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
