package operator;

public class Operator_math {

	public static void main(String[] args) {
		// ���������
		System.out.println(5+3);
		System.out.println(5-3);
		System.out.println(5*3);
		System.out.println(5/3);  //��
		System.out.println(5%3);  //������
		
		// ������ ������ ��� ���ϱ�
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 2;
		System.out.println(avgScore);

	}

}
