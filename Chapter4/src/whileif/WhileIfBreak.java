package whileif;

public class WhileIfBreak {

	public static void main(String[] args) {
	    //�ݺ� ���ǹ�
		int i = 0;
		while(true) {
			i++;
			System.out.println("Hello " + i);
			if(i == 10)
				break;
		}
		System.out.println("====================");
		
		// 1���� 10���� ���ϱ�
		int n = 0;
		int sumV = 0;
		while(true) {
			n++;
			sumV += n;
			if(n == 10)
				break;
		}
		System.out.println("�հ� : " + sumV);
	}
}
