package loopexample;

public class WhileHello_10 {

	public static void main(String[] args) {
	    //Hello 10�� �ݺ� -> ���ѹݺ� ����
		int i=1;
		while(true) {
			System.out.println("Hello " + i);
			i++;
			if(i==11)
				break;
		}
		
		// 10�� �ݺ�
		int n = 1;
		while(n<=10) {
			System.out.println("Hello" + n);
			n++;
		}
		
		
	}

}
