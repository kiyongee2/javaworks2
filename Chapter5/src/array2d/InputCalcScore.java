package array2d;

import java.util.Scanner;

public class InputCalcScore {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] subject = {"����", "����", "����"};  //����
		String[] name = new String[3];   //�̸�
		int[][] score = new int[3][4];   //����
		double[] avg = new double[3];    //���
		int sumV = 0;                    //�հ�
		
		//����
		for(int i=0; i<score.length; i++) {
			System.out.print("�̸� �Է��� �Է��ϼ���: ");
			name[i] = sc.nextLine();
			
			for(int j=0; j<score.length; j++) {  //score.length = 3
				System.out.print(subject[j] + "������ �Է��ϼ���: ");
				score[i][j] = Integer.parseInt(sc.nextLine());
				sumV += score[i][j];
			}
			score[i][3] = sumV;   //4���� �հ� ����
			avg[i] = (double)sumV / score.length;  //��� 5���� �����
			sumV = 0;   //���� �� ����� ���� �ʱ�ȭ��
		}
		
		//���
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i] + " ");
			for(int j=0; j<score[i].length; j++) {  //5������ ���
				System.out.print(score[i][j] + " ");
			}
			System.out.printf("%.2f", avg[i]);
			System.out.println();
		}
		sc.close();
	}
}
