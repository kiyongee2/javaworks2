package scanners;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		//Scanner Ŭ���� ���
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����� �̸��� �����Դϱ�? ");
		String name = scanner.nextLine();
		System.out.println("����� �̸��� " + name + "�̱���.");	
		
		System.out.print("����� ���̴� �� ���Դϱ�? ");
		int age = scanner.nextInt();
		System.out.println("����� ���̴� " + age + "�� �̱���.");
		
		scanner.close();
	}
}

