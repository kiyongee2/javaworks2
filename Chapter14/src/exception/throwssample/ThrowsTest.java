package exception.throwssample;

class ArrayUtil {
	public void call() throws Exception {
		//System.out.println("call �޼��� ����");
		int[] num = new int[2];
		num[0] = 1;
		num[1] = 2;
		//num[2] = 3;

		System.out.println("call �ż��� ����");
	}
}

public class ThrowsTest {

	public static void main(String[] args) {
		ArrayUtil util = new ArrayUtil();
		try {
			util.call();
			System.out.print("Hello");
		} catch (Exception e) {
			System.out.println("main �ż��忡�� ���� ó��");
		}
		System.out.println(" World");
	}
}
