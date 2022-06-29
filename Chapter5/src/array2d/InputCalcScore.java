package array2d;

import java.util.Scanner;

public class InputCalcScore {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] subject = {"국어", "수학", "영어"};  //과목
		String[] name = new String[3];   //이름
		int[][] score = new int[3][4];   //점수
		double[] avg = new double[3];    //평균
		int sumV = 0;                    //합계
		
		//저장
		for(int i=0; i<score.length; i++) {
			System.out.print("이름 입력을 입력하세요: ");
			name[i] = sc.nextLine();
			
			for(int j=0; j<score.length; j++) {  //score.length = 3
				System.out.print(subject[j] + "점수를 입력하세요: ");
				score[i][j] = Integer.parseInt(sc.nextLine());
				sumV += score[i][j];
			}
			score[i][3] = sumV;   //4열에 합계 저장
			avg[i] = (double)sumV / score.length;  //평균 5열에 저장됨
			sumV = 0;   //다음 행 계산을 위해 초기화함
		}
		
		//출력
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i] + " ");
			for(int j=0; j<score[i].length; j++) {  //5열까지 출력
				System.out.print(score[i][j] + " ");
			}
			System.out.printf("%.2f", avg[i]);
			System.out.println();
		}
		sc.close();
	}
}
