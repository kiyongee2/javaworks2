package loopexample;

public class DoWhile {

	public static void main(String[] args) {
	
		int n = 0;
		int sum = 0;
		
		do {
			n++;
			sum += n;
			System.out.println("���๮");
		}while(n < 10);
		
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
	}

}
