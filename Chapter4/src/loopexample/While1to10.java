package loopexample;

public class While1to10 {

	public static void main(String[] args) {
	
		int n = 0;
		int sum = 0;
		
		while(n < 10) {
			n++;
			sum += n;
		}
		
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
	}

}
