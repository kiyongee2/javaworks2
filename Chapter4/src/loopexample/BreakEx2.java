package loopexample;

public class BreakEx2 {

	public static void main(String[] args) {
		//1���� �������� �� ���� 100�� �Ѵ� �ڿ����� ���ϱ�?
		int n = 0;
		int sum = 0;
	
		for(n = 0; ; n++) {
			sum += n;
			if(sum > 100)
			  break;
		}
		
		System.out.println(sum);
		System.out.println(n);
	}
}
