package inputscanner;

import java.util.Scanner;
public class InputEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �̸��� �����Դϱ�? ");
		String name = sc.nextLine();
		System.out.println("�̸� :" + name);
		
		System.out.print("����� ���̴� �� ���ΰ���? ");
		int age = sc.nextInt();
		System.out.println("���� : " + age);
		sc.close();
	}
}
