package input_example;

import java.util.Scanner;

public class CoffeeMachine {
	public static void main(String[] args) {
		// Ŀ�� �ڵ��Ǹű�
		Scanner sc = new Scanner(System.in);
		int coffee = 5;
		while(true) {
			System.out.println("���� �־��ּ���: ");
			int money = sc.nextInt();
			if(money==500) {
				System.out.println("Ŀ�ǰ� ���ɴϴ�.");
				coffee = coffee - 1;
			}
			else if(money>500) {
				System.out.println("�Ž����� " + (money-500) + "���� �����ְ� Ŀ�ǰ� ���ɴϴ�.");
				coffee = coffee - 1;
			}
			else {
				System.out.println("���� �����ְ� Ŀ�Ǵ� ������ �ʽ��ϴ�.");
			}
			System.out.println("���� Ŀ���� ���� " + coffee + "���Դϴ�.");
			
			if(coffee == 0) {
				System.out.println("Ŀ�ǰ� �� ���������ϴ�. �ǸŸ� ���� �մϴ�.");
				break;
			}
		}
		sc.close();
	}

}
