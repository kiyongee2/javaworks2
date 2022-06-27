package mathexample;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		String[] words = {"ant", "bear", "chicken", "cat", "dog", "deer", "eagle", "fox",
				"lion", "monkey", "penguin", "tiger"};
		
		int n = 1;
		long start, end;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�غ�Ǹ� ����");
		scan.nextLine();
		start = System.currentTimeMillis();
		while(n < 11) {
			int rand = (int)(Math.random()*words.length);
			System.out.println("����" + n);
			String question = words[rand];
			System.out.println(question);
			
			String answer = scan.nextLine();
			if(answer.equals(question)) {
				System.out.println("���!!");
				n++;   //���� ������ �Ѿ
			}else {
				System.out.println("��Ÿ!! �ٽ� ����!!");
			}
		}//while �ݱ�
		end = System.currentTimeMillis();
		System.out.println("���� �ҿ� �ð��� " + (end-start)/1000 + "�� �Դϴ�.");
		scan.close();
	}//main �ݱ�
}
