package decorator.bufferdstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EnglishTypingGame {

	public static void main(String[] args) {
		/*
		   ���� �ܾ� ���� - �� 10 ���� ����
		   �ܾ�� �ܺ� ������ �о��
		   ���� �ҿ� �ð� ����
		 */
		Scanner sc = new Scanner(System.in);
		try(FileReader fr = new FileReader("word.txt");
			BufferedReader br = new BufferedReader(fr)){
			
			String[] word = null; 
			String data = null;
			while(true) {
				data = br.readLine();
				if(data == null) break;
				word = data.split(" ");
			}
			//System.out.println(word[0]); //ant Ȯ��
			int n = 1;  //���� ��ȣ
			long start = 0, end = 0;
			System.out.println("Ÿ�� ���� ���� - �غ�Ǹ� [Enter]");
			sc.nextLine();
			start = System.currentTimeMillis();
			while(n <= 10) {
				System.out.println("���� " + n);
				int rand = (int)(Math.random()*word.length);
				String question = word[rand];
				System.out.println(question);  //���� ǥ��
				
				String answer = sc.nextLine(); //�亯 �Է�
				
				if(answer.equals(question)) {
					System.out.println("���!!");
					n++;   //����1 ����
				}else {
					System.out.println("��Ÿ! �ٽ� ����!");
				}
			}
			end = System.currentTimeMillis();
			//float�� ��ȯ - �Ҽ����� ���
			System.out.println("���� �ҿ�ð� " + (float)(end-start)/1000 + "��");
			sc.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
