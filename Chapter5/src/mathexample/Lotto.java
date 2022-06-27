package mathexample;

public class Lotto {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		int i, j;
		System.out.println(lotto.length);
		
		//�ζ� ��ȣ ����
		for(i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			//�ߺ� ��ȣ ����
			for(j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					System.out.println("�ߺ� ��ȣ : " + lotto[i]);
					i--;
				}
			}
			/*
			  27 23 6 39 33 30 -> 23�� �ߺ���ȣ�� ���
			  i=0, j=0,        27
			  i=1, j=0,1       23
			  i=2, j=0,1,2     23
			  i=2, j=0,1,2     6
			 * 
			 */
		}
		//�ζ� ��ȣ ���
		for(i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
