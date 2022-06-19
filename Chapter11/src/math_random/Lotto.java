package math_random;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// ���� ��ȣ
		int[] selNumber = new int[6];  // ���� ��ȣ 6���� ����� �迭 ����
		int i;
		
		Random rand = new Random(3);  //���� ��ȣ�� ��� ���� ��ü ����(seed��)
		System.out.print("���� ��ȣ : ");
		for(i=0; i<6; i++) {
			selNumber[i] = rand.nextInt(45) + 1;
			System.out.print(selNumber[i] + " ");
		}
		System.out.println();
		
		// ��÷ ��ȣ
		int[] winNumber = new int[6];
		rand = new Random(3);   //��÷ ��ȣ�� ��� ���� ��ü ����
		System.out.print("��÷ ��ȣ: ");
		for(i=0; i<6; i++) {
			winNumber[i] = rand.nextInt(45) + 1;
			System.out.print(winNumber[i] + " ");
		}
		System.out.println();
		
		// ��÷ ����
		boolean result = Arrays.equals(selNumber, winNumber);
		System.out.print("��÷ ���� : ");
		if(result) {
			System.out.println("1� ��÷�Ǽ̽��ϴ�.");
		}
		else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
	}

}
