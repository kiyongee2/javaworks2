package scanners;

import java.util.Scanner;

public class InputIsEven {

	public static void main(String[] args) {
		// ���� �Է¹޾Ƽ� ¦��,Ȧ�� �Ǻ��ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		String str = (num % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println(str);
		sc.close();
	}
}
