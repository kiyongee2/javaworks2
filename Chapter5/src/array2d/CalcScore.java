package array2d;

public class CalcScore {

	public static void main(String[] args) {
		//�л� 5���� ����, ���� ���� �հ� 
		int[][] score = {
				{91, 70},
				{80, 50},
				{76, 60},
				{90, 49},
				{80, 80}
		}; 
		int[] total  = {0, 0};
		double[] avg = {0.0, 0.0};
		int i, j;
		
		//������ ���(��ȸ)
		for(i=0; i<score.length; i++) {
			for(j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
		
		//���
		for(i=0; i<score.length; i++) {
			total[0] += score[i][0];
			total[1] += score[i][1];
		}
		avg[0] = (double)total[0] / score.length;
		avg[1] = (double)total[1] / score.length;
		
		System.out.println("���� ���� �հ� : " + total[0]);
		System.out.println("���� ���� ��� : " + avg[0]);
		System.out.println("���� ���� �հ� : " + total[1]);
		System.out.println("���� ���� ��� : " + avg[1]);

	}

}
