package math_random;

import java.util.Random;

public class lotto2 {

	public static void main(String[] args) {
		int[] lotto = new int[6];  //�ζ� 6�ڸ� ����
		
		Random rand = new Random();
		System.out.print("��÷ ��ȣ : ");
		for(int i=0; i<6; i++) {
			lotto[i] = rand.nextInt(45) + 1;
			System.out.print(lotto[i] + " ");
		}
	}

}
