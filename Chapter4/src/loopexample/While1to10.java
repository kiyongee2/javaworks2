package loopexample;

public class While1to10 {

	public static void main(String[] args) {
		//1~4���� ���ϱ�
		int num = 1;
		num += 2;
		num += 3;
		num += 4;
		System.out.println("num = " + num);
	
		//1���� 10������ �հ�
		int n = 0;    //�ݺ� ����
		int sum = 0;  //�հ�
		
		while(n < 10) {
			n++;
			sum += n;  //sum = sum + n
			System.out.println("n = " + n + ", sum = " + sum);
		}
		
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
	}
}
