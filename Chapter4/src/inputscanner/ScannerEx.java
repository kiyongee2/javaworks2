package inputscanner;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = scanner.nextLine();
		System.out.println("�̸� " + name);
		
		System.out.println("���̸� �Է��ϼ��� : ");
		int age = scanner.nextInt();
		System.out.println("���� : " + age);
		scanner.close();
	}

}
