package exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("words.txt");
			BufferedReader br = new BufferedReader(fr)){
			String line;
			String[] words=null;
			while((line=br.readLine()) !=null) {
				words = line.split(" ");
			}
			
			int n = 1;    //���� ��ȣ
			long millisecond = 0;
			System.out.println("����Ÿ�� ����");
			Scanner sc = new Scanner(System.in);
			millisecond = System.currentTimeMillis();    //���� ���� �� �ð�
			for(int i=0; i<10; i++) {
				int rand = (int)(Math.random()*words.length);
				System.out.println("����" + n);
				String question = words[rand];
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
			System.out.println("���ӿ� �ɸ� �ð��� " + (float)millisecond/1000+ "���Դϴ�.");
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
