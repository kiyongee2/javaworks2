package chapter5;

import java.util.Scanner;

public class InputDate {

	public static void main(String[] args) {
		//�⵵�� �Է��ϸ� ������ �˷��ִ� ���α׷�
		Scanner sc = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���: ");
		int year = sc.nextInt();
		if((year%4==0 && year % 100 !=0) || year % 400  == 0) {
			System.out.println(year + "���� ����");
		}
		else {
			System.out.println(year + "���� ���");
		}
		sc.close();
	}
}
