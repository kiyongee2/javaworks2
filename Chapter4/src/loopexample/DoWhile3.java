package loopexample;

import java.util.Scanner;

public class DoWhile3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = 1;
		System.out.println("�ȳ��ϼ���.");
		while(n != 0) {
			n = sc.nextInt();
			System.out.println("�ȳ��ϼ���.");
		}
		
		System.out.println("�ݺ� ����");
		sc.close();
	}
}
