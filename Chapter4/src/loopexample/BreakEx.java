package loopexample;

public class BreakEx {

	public static void main(String[] args) {
		//1���� �������� �� ���� 100�� �Ѵ� �ڿ����� ���ϱ�?
		int n=0;
		int sum = 0;
		
		while(true) {
			sum += n;
			if(sum > 100)
			  break;
			n++;
		}
		
		System.out.println(sum);
		System.out.println(n);
	}
}
