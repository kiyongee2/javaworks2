package math_random;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int com = rand.nextInt(30) + 1;
		
		while(true) {
			System.out.println("����(1-30)�� �Է��ϼ��� : ");
			int num = sc.nextInt();
			if(com==num) {
				System.out.println("����..����� õ��!");
				break;
			}
			else if(com>num)
				System.out.println("�ʹ� �۾ƿ�");
			else
				System.out.println("�ʹ� Ŀ��");	
		}
		sc.close();
	}
}
