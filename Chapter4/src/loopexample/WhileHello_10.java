package loopexample;

public class WhileHello_10 {

	public static void main(String[] args) {
	    //Hello 10번 반복 -> 무한반복 구조
		int i=1;
		while(true) {
			System.out.println("Hello " + i);
			i++;
			if(i==11)
				break;
		}
		
		// 10번 반복
		int n = 1;
		while(n<=10) {
			System.out.println("Hello" + n);
			n++;
		}
		
		
	}

}
