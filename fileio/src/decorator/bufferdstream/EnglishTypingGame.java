package decorator.bufferdstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EnglishTypingGame {

	public static void main(String[] args) {
		/*
		   영어 단어 게임 - 총 10 문제 출제
		   단어는 외부 파일을 읽어옴
		   게임 소요 시간 측정
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
			//System.out.println(word[0]); //ant 확인
			int n = 1;  //문제 번호
			long start = 0, end = 0;
			System.out.println("타자 연습 게임 - 준비되면 [Enter]");
			sc.nextLine();
			start = System.currentTimeMillis();
			while(n <= 10) {
				System.out.println("문제 " + n);
				int rand = (int)(Math.random()*word.length);
				String question = word[rand];
				System.out.println(question);  //문제 표시
				
				String answer = sc.nextLine(); //답변 입력
				
				if(answer.equals(question)) {
					System.out.println("통과!!");
					n++;   //문제1 증가
				}else {
					System.out.println("오타! 다시 도전!");
				}
			}
			end = System.currentTimeMillis();
			//float형 변환 - 소수까지 출력
			System.out.println("게임 소요시간 " + (float)(end-start)/1000 + "초");
			sc.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
