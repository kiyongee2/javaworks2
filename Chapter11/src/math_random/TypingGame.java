package math_random;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		String[] data = {"bear", "cat", "dog", "eagle", "monkey", "tiger"
				         , "penguin", "lion", "snake", "dolphin"};
		int n = 1;    //���� ��ȣ
		long millisecond = 0;
		
		System.out.println("����Ÿ�� ����");
		Scanner sc = new Scanner(System.in);
		millisecond = System.currentTimeMillis();    //���� ���� �� �ð�
		for(int i=0; i<10; i++) {
			int rand = (int)(Math.random()*data.length);
			System.out.println("����" + n);
			String question = data[rand];
			System.out.println(question);
			
			String answer = sc.next();
			if(answer.equals(question)) {
				System.out.println("���!");
				n++;
			}
			else {
				System.out.println("��Ÿ! �ٽ� ����");
			}
		}
		millisecond = System.currentTimeMillis() - millisecond;
		System.out.println("���� �ҿ� �ð� " + (float)millisecond/1000+ "���Դϴ�.");
		sc.close();
	}
}
