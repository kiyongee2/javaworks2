package loopexample;

public class ContinueEx2 {

	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num=1; num<=10; num++) {
			if(num % 2 == 0)
				continue;
			total += num;
			System.out.println(num);
		}  //1,3,5,7,9
		System.out.println("1���� 10������ Ȧ���� ���� : " + total + "�Դϴ�.");

	}
}
