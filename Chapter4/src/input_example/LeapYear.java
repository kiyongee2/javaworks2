package input_example;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		//���� - 4�� ���� ����, 100�� ������ �ƴϳ� 400�� ������ �´�.
		//int year = 2021; 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "���� �����Դϴ�.");
		}
		else {
			System.out.println(year + "���� ����Դϴ�.");
		}
		sc.close();
	}
}
