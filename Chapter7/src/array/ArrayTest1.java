package array;

public class ArrayTest1 {
	public static void main(String[] args) {
		/* ������ ����Ͽ� ���� ���� - ��ȿ����
		int std1KorScore = 0;
		int std1EngScore = 0;
		int std1MathScore = 0;
		
		int std2KorScore = 0;
		int std2EngScore = 0;
		int std2MathScoree = 0;*/
		
		//�迭�� �̿��Ͽ� ���� ����
		int[] korScore = new int[3];    //3���� �������� �迭
		korScore[0] = 90;
		korScore[1] = 80;
		korScore[2] = 70;
		
		//int korScore = {90, 80, 70};  //�迭 ������ �ʱ�ȭ
		
		//�迭�� ũ��(����)
		System.out.println(korScore.length + "��");
		
		//1�� �ε��� �� ��ȸ
		System.out.println(korScore[1]);
		
		//��ü ��ȸ
		for(int i = 0; i < korScore.length; i++) {
			System.out.println(korScore[i]);
		}
	}
}
