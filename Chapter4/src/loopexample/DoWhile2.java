package loopexample;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("�ȳ��ϼ���");
			n = sc.nextInt();
		}while(n!=0);
		
		System.out.println("�ݺ� ����");
		sc.close();
	}
}
